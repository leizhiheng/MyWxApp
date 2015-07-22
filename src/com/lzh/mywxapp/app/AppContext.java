package com.lzh.mywxapp.app;

import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

import android.app.Application;
import android.util.Log;

public class AppContext extends Application{

	private static final String TAG = "AppContext";

	private static final String APP_ID_WX = "wx8a2507b2d985af62";//微信AppId
	private static final String APP_SECRET = "66206da4f750531554d63825e94ecea1";//微信AppSecret
	
	public static IWXAPI wxapi;//第三方app和微信通信的openapi接口
	
	@Override
	public void onCreate() {
		super.onCreate();
		regToWX();
		
		Log.d(TAG, "===》 "+TAG+" onCreate()");
	}
	
	private void  regToWX(){
		//获取api实例
		wxapi = WXAPIFactory.createWXAPI(this, APP_ID_WX, true);
		//将应用的AppId注册到微信
		wxapi.registerApp(APP_ID_WX);
	}

}
