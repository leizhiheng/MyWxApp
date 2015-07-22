package com.lzh.mywxapp.app;

import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

import android.app.Application;
import android.util.Log;

public class AppContext extends Application{

	private static final String TAG = "AppContext";

	private static final String APP_ID_WX = "wx8a2507b2d985af62";//΢��AppId
	private static final String APP_SECRET = "66206da4f750531554d63825e94ecea1";//΢��AppSecret
	
	public static IWXAPI wxapi;//������app��΢��ͨ�ŵ�openapi�ӿ�
	
	@Override
	public void onCreate() {
		super.onCreate();
		regToWX();
		
		Log.d(TAG, "===�� "+TAG+" onCreate()");
	}
	
	private void  regToWX(){
		//��ȡapiʵ��
		wxapi = WXAPIFactory.createWXAPI(this, APP_ID_WX, true);
		//��Ӧ�õ�AppIdע�ᵽ΢��
		wxapi.registerApp(APP_ID_WX);
	}

}
