package com.lzh.mywxapp.ui.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lzh.mywxapp.R;
import com.lzh.mywxapp.app.ActivityManager;

public class HeadView extends RelativeLayout implements OnClickListener{

	private Context mContext;
	
	private View layout_left, layout_middle, layout_right;
	
	public HeadView(Context context){
		this(context,null);
		mContext = context;
	}
	
	public HeadView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		initView();
	}
	
	public void initView(){
		View view = LayoutInflater.from(mContext).inflate(R.layout.layout_commen_title, this, true);
		this.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
		layout_left = findViewById(R.id.layout_left);
		layout_middle = findViewById(R.id.layout_middl);
		layout_right = findViewById(R.id.layout_right);
	}
	
	public void setTitle(String msg){
		layout_middle.setVisibility(View.VISIBLE);
		TextView title = (TextView) findViewById(R.id.tv_title);
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
	protected void onLayout(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		
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
