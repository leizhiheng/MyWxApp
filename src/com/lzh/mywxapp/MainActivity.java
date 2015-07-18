package com.lzh.mywxapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.lzh.mywxapp.app.BaseActivity;

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

	private ListView mListView;
	private String[] titleItems = new String[]{"To Wx share And Collection"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base);
//		setContentLayout(R.layout.activity_main);
//		initView();
	}
	
	public void initView(){
		setTitle("首页");
		mListView = (ListView) findViewById(R.id.listview_main);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.simple_list_item_1, titleItems);
		mListView.setAdapter(adapter);
		
		mListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
//				showToast("item "+titleItems[arg2]+" has been clicked");
			}
		});
	}
}
