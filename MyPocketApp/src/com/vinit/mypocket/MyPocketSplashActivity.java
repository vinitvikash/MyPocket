package com.vinit.mypocket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MyPocketSplashActivity extends Activity{
	private Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mp_splash);
		
		Thread welcomeScreen = new Thread(){
			@Override
			public void run() {
//				super.run();
				try {
					sleep(2000);
					if (intent == null) {
						startActivity(new Intent(getApplicationContext(), MyPocketActivity.class));
					}
				} catch (InterruptedException ie) {
					finish();
				}
			}
		};
		
		welcomeScreen.start();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
	}
}
