package com.example.ScanningPictures;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity  {

	
	//定义一个访问图片的数组
	int [] images=new int[]
			{
			 R.drawable.aa,R.drawable.ee,R.drawable.qq,R.drawable.demo,
			};
	  int currentImg=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LinearLayout mian=(LinearLayout)findViewById(R.id.root);
		final ImageView image=new ImageView(this);//将ImageView组件添加到LinearLayout的布局管理器
		mian.addView(image);
		image.setImageResource(images[0]);//初始化的时候显示第一张图片
		image.setOnClickListener(new  OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				image.setImageResource(images[++currentImg%images.length]);
				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

	
