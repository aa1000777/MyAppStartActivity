package com.example.myappstartactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * 页面跳转主页面
 *****************************************************
 * <hr>
 * <dt><span class="strong">类功能简介:</span></dt>
 * <dd>页面跳转主页面</dd>
 * <dt><span class="strong">创建时间:</span></dt>
 * <dd>2014-8-6 下午2:27:06</dd>
 * <dt><span class="strong">公司:</span></dt>
 * <dd>CorpIt</dd>
 * @author aa1000777 - Email:aa1000777@qq.com
 *****************************************************
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
