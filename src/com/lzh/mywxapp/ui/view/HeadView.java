package com.lzh.mywxapp.ui.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lzh.mywxapp.R;
import com.lzh.mywxapp.app.ActivityManager;

public class HeadView extends RelativeLayout implements OnClickListener{

	private static final String TAG = "HeadView";
	private Context mContext;
	
	private View layout_left, layout_middle, layout_right;
	private LinearLayout headview;
	public HeadView(Context context){
		super(context);
		initView(context);
	}
	
	public HeadView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView(context);
	}
	
	public HeadView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initView(context);
	}
	
	public void initView(Context context){
		Log.d(TAG, "===> initView");
		mContext = context;
		View view = LayoutInflater.from(mContext).inflate(R.layout.layout_commen_title, this, true);
		layout_left = findViewById(R.id.layout_left);
		layout_middle = findViewById(R.id.layout_middl);
		layout_right = findViewById(R.id.layout_right);
	}
	
	public void setTitle(String msg){
		layout_middle.setVisibility(View.VISIBLE);
		TextView title = (TextView) findViewById(R.id.tv_title);
		Log.d(TAG, "setTitle msg = "+msg);
		title.setText(msg);
	}
	
	public void showBackBtn(){
		layout_left.setVisibility(View.VISIBLE);
		layout_left.setOnClickListener(this);
	}
	
	public void showRightBtn(){
		layout_right.setVisibility(View.VISIBLE);
		layout_right.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.layout_left:
			ActivityManager.finish((Activity)mContext);
			break;
		case R.id.layout_right:
			
			break;

		default:
			break;
		}
	}

}
