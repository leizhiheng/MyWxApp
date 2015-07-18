package com.lzh.mywxapp;

import android.app.Activity;
import android.os.Bundle;

/**
 * 微信功能集成
 * @author lzh
 * 
 * 使用微信API：
 * 1.将jar包放入libs目录下
 * 2.在AndroidMenifest.xml文件中添加必要的权限申明
 * 3.注册到微信
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	

}
