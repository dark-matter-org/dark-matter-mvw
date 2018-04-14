package org.dmd.dmp.client;


import org.dmd.dmp.shared.generated.dmo.ActionCancelRequestDMO;
import org.dmd.dmp.shared.generated.dmo.ActionCancelResponseDMO;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class ActionCancelResponseCallback extends ResponseCallback implements AsyncCallback<ActionCancelResponseDMO>{
	
	public static final int ID = 7;
	
	public ActionCancelResponseCallback(ActionCancelRequestDMO req, ResponseHandlerIF h, CommsControllerIF cc, ErrorOptionsEnum rpc, ErrorOptionsEnum dmp){
		super(req,h,cc,ID,rpc,dmp);
	}

	@Override
	public void onFailure(Throwable caught) {
		rpcError(caught);
	}

	@Override
	public void onSuccess(ActionCancelResponseDMO response) {
		handleResponse(response);
	}

}
