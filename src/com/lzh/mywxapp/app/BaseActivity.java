package com.lzh.mywxapp.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.lzh.mywxapp.R;
import com.lzh.mywxapp.ui.view.HeadView;

public class BaseActivity extends FragmentActivity {

	private static final String TAG = "BaseActivity";
	private ViewGroup layout_base;
	private HeadView headView;
	private FrameLayout container;
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
//		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
		setContentView(R.layout.activity_base);
		
		initView();
	}
	
	private void initView() {
		layout_base = (ViewGroup) findViewById(R.id.layout_base);
		headView = (HeadView) findViewById(R.id.head_view);
		container = (FrameLayout) findViewById(R.id.container);
	}
	
	/*
	 * …Ë÷√±ÍÃ‚
	 */
	protected void setTitle(String msg) {
		headView.setTitle(msg);
	}
	
	protected void showBackBtn() {
		headView.showBackBtn();
	}
	
	protected void showRightBtn() {
		headView.showRightBtn();
	}
	
	public void setContentLayout(int layoutId) {
		setContentLayout(LayoutInflater.from(this).inflate(layoutId, null));
	}
	
	protected void setContentLayout(View view){
		container.addView(view);
		Log.d(TAG, "setContentLayout(View view) ");
	}
	
	protected void showToast(String msg) {
		Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
	}
}
