package de.uni_koeln.spinfo.maalr.webapp.controller;

import org.springframework.stereotype.Controller;

import de.uni_koeln.spinfo.maalr.common.server.util.Configuration;
import de.uni_koeln.spinfo.maalr.webapp.ui.common.client.ConfigService;

@Controller("configService")
public class ConfigController implements ConfigService {

	@Override
	public String getContextPath() {
		return Configuration.getInstance().getDictContext();
	}

}
