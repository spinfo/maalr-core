/*******************************************************************************
 * Copyright 2013 Sprachliche Informationsverarbeitung, University of Cologne
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.uni_koeln.spinfo.maalr.common.shared.searchconfig;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import com.sun.j3d.utils.behaviors.vp.WandViewBehavior.TranslationListener6D;
import de.uni_koeln.spinfo.maalr.common.server.util.Configuration;

public class Localizer {

	private static Map<String, TranslationMap> translations = new HashMap<String, TranslationMap>();
	private static HashMap<String, TranslationMap> editorTranslations = new HashMap<String, TranslationMap>();
	private static Logger logger = LoggerFactory.getLogger(Localizer.class);
	private static String LOCALE;

	public static UiConfiguration localize(UiConfiguration uiConfiguration,
			String locale) {
		// FIXME: method is called three times. the last two time locale is set
		// with empty string. 
		TranslationMap map = translations.get(locale);
		if (!locale.equals("")) {
			//logger.info("locale for ui coniguration : " + locale);
			LOCALE = locale;
			map = translations.get(LOCALE);
		}
		if (map == null) {
			map = new TranslationMap();
			Properties translation = new Properties();
			File file = new File(Configuration.getInstance()
					.getConfigDirectory(), "i18n/user-searchui_" + LOCALE
					+ ".properties");
			if (!file.exists()) {
				file = new File(Configuration.getInstance()
						.getConfigDirectory(), "i18n/user-searchui.properties");
			}
			try (BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(file), "UTF-8"))) {
				translation.load(br);
				Set<Entry<Object, Object>> entrySet = translation.entrySet();
				for (Entry<Object, Object> entry : entrySet) {
					map.put((String) entry.getKey(), (String) entry.getValue());
				}
				map.setSourceFileName(file.getName());
			} catch (IOException e) {
				logger.error("Failed to load ui config for locale " + locale
						+ ", returning default", e);
				return uiConfiguration;
			}
			translations.put(LOCALE, map);
		}
		UiConfiguration localized = new UiConfiguration();
		List<UiField> fields = uiConfiguration.getFields();
		List<UiField> localizedFields = new ArrayList<UiField>();
		for (UiField field : fields) {
			UiField copy = localizeField(map, field);
			localizedFields.add(copy);
		}
		localized.setFields(localizedFields);
		if (uiConfiguration.getMainFields() != null) {
			localized.setMainFields(new ArrayList<String>(uiConfiguration
					.getMainFields()));
		}
		localized.setMoreLabel(map.get("more_options"));
		localized.setLessLabel(map.get("less_options"));
		return localized;
	}

	private static UiField localizeField(TranslationMap map, UiField field) {
		UiField uiField = new UiField();
		uiField.setBuildIn(field.isBuildIn());
		uiField.setId(field.getId());
		uiField.setType(field.getType());
		uiField.setLabel(map.get(field.getId()));
		uiField.setHasSubmit(field.hasSubmitButton());
		if (field.hasSubmitButton()) {
			uiField.setSubmitLabel(map.get(field.getId() + "_submit"));
		}
		if (field.getValues() != null) {
			uiField.setValues(new ArrayList<String>());
			uiField.getValues().addAll(field.getValues());
			uiField.setValueLabels(new ArrayList<String>());
			for (String valueId : field.getValues()) {
				String valueName = map.get(valueId);
				uiField.getValueLabels().add(valueName);
			}
		}
		uiField.setInitialValue(field.getInitialValueIndex());
		return uiField;
	}

	public static String getTranslation(String locale, String key) {
		TranslationMap map = getEditorTranslations(locale);
		return map.get(key);
	}

	public static TranslationMap getEditorTranslations(String locale) {
		logger.info("Requesting translated editor strings for locale " + locale);
		TranslationMap map = editorTranslations.get(locale);
		if (map == null) {
			Properties properties = new Properties();
			try {
				String fileName = "i18n/lemma-description_" + locale
						+ ".properties";
				File file = new File(Configuration.getInstance()
						.getConfigDirectory(), fileName);
				if (!file.exists()) {
					file = new File(Configuration.getInstance()
							.getConfigDirectory(),
							"i18n/lemma-description.properties");
				}
				logger.info("Loading strings from file " + file);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(file), "UTF-8"));
				properties.load(br);
				br.close();
				map = new TranslationMap();
				Set<Entry<Object, Object>> entrySet = properties.entrySet();
				for (Entry<Object, Object> entry : entrySet) {
					map.put((String) entry.getKey(), (String) entry.getValue());
				}
				map.setSourceFileName(file.getName());
				editorTranslations.put(locale, map);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// logger.info("Returning translation: " + map);
		return map;
	}

}
