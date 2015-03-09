package de.uni_koeln.spinfo.maalr.webapp.ui.common.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ConfigServiceAsync {

	void getContextPath(AsyncCallback<String> callback);

}
