package de.uni_koeln.spinfo.maalr.webapp.ui.common.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("rpc/config")
public interface ConfigService extends RemoteService  {
	
	public String getContextPath();

}
