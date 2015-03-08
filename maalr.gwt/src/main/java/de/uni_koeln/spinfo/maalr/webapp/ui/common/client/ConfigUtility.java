package de.uni_koeln.spinfo.maalr.webapp.ui.common.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class ConfigUtility {
	
	private static ConfigServiceAsync service = GWT.create(ConfigService.class);
	private static String context;
	
	public static void getContextPath(final AsyncCallback<String> callback) {
		if(context == null) {
			
			service.getContextPath(new AsyncCallback<String>() {

				@Override
				public void onFailure(Throwable arg0) {
					Dialog.showError("Service unavailable", arg0);
				}

				@Override
				public void onSuccess(String contextPath) {
					context = contextPath; 
					callback.onSuccess(context);	
				}
			}); 
		} else {
			callback.onSuccess(context);	
		}
		
		
	}

}
