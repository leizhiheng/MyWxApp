package com.lzh.mywxapp.context;

import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

import android.app.Application;
import android.util.Log;

public class AppContext extends Application{

	private static final String TAG = "AppContext";

	private static final String APP_ID_WX = "wx8a2507b2d985af62";//΢��AppId
	private static final String APP_SECRET = "66206da4f750531554d63825e94ecea1";//΢��AppSecret
	
	private IWXAPI api;//������app��΢��ͨ�ŵ�openapi�ӿ�
	
	@Override
	public void onCreate() {
		super.onCreate();
		regToWX();
		
		Log.d(TAG, "===�� "+TAG+" onCreate()");
	}
	
	private void  regToWX(){
		//��ȡapiʵ��
		api = WXAPIFactory.createWXAPI(this, APP_ID_WX, true);
		//��Ӧ�õ�AppIdע�ᵽ΢��
		api.registerApp(APP_ID_WX);
	}

}