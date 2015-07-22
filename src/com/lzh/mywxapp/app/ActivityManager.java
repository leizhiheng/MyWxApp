package com.lzh.mywxapp.app;

import com.lzh.mywxapp.R;
import com.lzh.mywxapp.R.anim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ActivityManager {

	
	public static void startActivity(Class<?> toClass, Bundle bundle, Activity fromActvity){
		Intent intent = new Intent(fromActvity,toClass);
		if (bundle != null) intent.putExtras(bundle);
		fromActvity.startActivity(intent);
		fromActvity.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
	}
	
	public static void startActivityForResult(Class<?> toClass, Bundle bundle, Activity fromActivity, int requstCode){
		Intent intent = new Intent(fromActivity,toClass);
		if (bundle != null) intent.putExtras(bundle);
		fromActivity.startActivityForResult(intent, requstCode);
		fromActivity.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
	}
	
	public static void finish(Activity activity){
		activity.finish();
		activity.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
	}
}
