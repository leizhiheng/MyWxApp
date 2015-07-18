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
 * ΢�Ź��ܼ���
 * @author lzh
 * 
 * ʹ��΢��API��
 * 1.��jar������libsĿ¼��
 * 2.��AndroidMenifest.xml�ļ�����ӱ�Ҫ��Ȩ������
 * 3.ע�ᵽ΢��
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
		setTitle("��ҳ");
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
