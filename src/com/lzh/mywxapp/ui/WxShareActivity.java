package com.lzh.mywxapp.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.lzh.mywxapp.R;
import com.lzh.mywxapp.app.AppContext;
import com.lzh.mywxapp.app.BaseActivity;
import com.tencent.mm.sdk.modelmsg.SendMessageToWX;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.WXWebpageObject;

public class WxShareActivity extends BaseActivity{

	private static final String TAG = "WxShareActivity";
	private EditText editText;
	
	public static final String WEB_PAGE_URL = "https://github.com/leizhiheng";
	private String title = "Ĭ�ϱ���";
	private String message = "Ĭ����Ϣ";
	
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentLayout(R.layout.activity_wx_share);
		setTitle("΢�ŷ���");
		showBackBtn();
		findView();
	}
	
	public void findView(){
		editText = (EditText) findViewById(R.id.edit_text);
	}
	
	private void getShareMsg(){
		String text = editText.getText().toString();
		int index = text.indexOf("#");
		if(index > 0){
			title = text.substring(0,index).trim();
			if(text.length() > index + 1) message = text.substring(index + 1, text.length()-1);
		}
		
		Log.d(TAG, "getShareMsg: title = "+title+", message = "+message);
	}
	
	
	public void doClick(View view){
		getShareMsg();
		switch (view.getId()) {
		case R.id.btn_share_webpage:
			shareWebPage(SendMessageToWX.Req.WXSceneSession,WEB_PAGE_URL);
			break;

		default:
			break;
		}
	}
	
	/**
	 * ������ҳ
	 * @param flag = SendMessageToWx.Req.WXSceneSession:����΢�ź���
	 *        flag = SendMessageToWx.Req.WXSceneTimeLine:��������Ȧ
	 *        flag = SendMessageToWx.Req.WXSceneFavorite:����΢���ղ�
	 * @param url webpage url
	 */
	public void shareWebPage(int flag, String url) {
		WXWebpageObject object = new WXWebpageObject();
		object.webpageUrl = url;
		WXMediaMessage mediaMessage = new WXMediaMessage(object);
		mediaMessage.title = title;
		mediaMessage.description = message;
		
		//�滻һ��ͼƬ��Դ
		Bitmap thumb = BitmapFactory.decodeResource(getResources(), R.drawable.pic_test_2);
		mediaMessage.setThumbImage(thumb);
		
		SendMessageToWX.Req req = new SendMessageToWX.Req();
		req.transaction = String.valueOf(System.currentTimeMillis());
		req.message= mediaMessage;
		req.scene = flag;
		
		AppContext.wxapi.sendReq(req);
	}
}
