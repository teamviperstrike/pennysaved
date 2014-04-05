package com.teamviperstrike.pennysaved;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create Typeface
		Typeface roboto =Typeface.createFromAsset(getAssets(),
                "fonts/Roboto-Light.ttf");
		Typeface maven =Typeface.createFromAsset(getAssets(),
                "fonts/MavenPro-Regular.ttf");

		// Set View Widgets
		TextView mainText = (TextView) findViewById(R.id.textView1);
		TextView aboutText = (TextView) findViewById(R.id.textAbout);
		TextView contactText = (TextView) findViewById(R.id.textContact);
		Button pintButton = (Button) findViewById(R.id.button1);
		Button faceButton = (Button) findViewById(R.id.button2);
		Button tryButton = (Button) findViewById(R.id.button3);

		// Set Typeface
		mainText.setTypeface(roboto);
		pintButton.setTypeface(maven);
		faceButton.setTypeface(maven);
		tryButton.setTypeface(maven);
		aboutText.setTypeface(maven);
		contactText.setTypeface(maven);
		
		 
		

		
		
	}
	
	public void completeProfile(View view) {
	     
		Intent profile = new Intent(this, Profile.class);
		startActivity(profile);
	 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
