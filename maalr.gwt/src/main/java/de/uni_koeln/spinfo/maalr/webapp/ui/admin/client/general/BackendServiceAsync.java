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
package de.uni_koeln.spinfo.maalr.webapp.ui.admin.client.general;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.uni_koeln.spinfo.maalr.common.shared.statistics.SystemSummary;
import de.uni_koeln.spinfo.maalr.lucene.stats.IndexStatistics;
import de.uni_koeln.spinfo.maalr.mongo.stats.BackupInfos;
import de.uni_koeln.spinfo.maalr.mongo.stats.DatabaseStatistics;

public interface BackendServiceAsync {
	
	void importDatabase(int maxItems, AsyncCallback<Void> callback);

	void dropDatabase(AsyncCallback<String> resultCallback);

	void reloadDatabase(AsyncCallback<String> resultCallback);

	void rebuildIndex(AsyncCallback<String> resultCallback);

	void getDatabaseStats(AsyncCallback<DatabaseStatistics> asyncCallback);

	void getIndexStats(AsyncCallback<IndexStatistics> callback);

	void getSystemSummary(AsyncCallback<SystemSummary> callback);
	
	void getBackupInfos(AsyncCallback<BackupInfos> callback);


}