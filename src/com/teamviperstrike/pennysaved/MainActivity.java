package com.teamviperstrike.pennysaved;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Typeface roboto =Typeface.createFromAsset(getAssets(),
                "fonts/Roboto-Light.ttf");
		Typeface maven =Typeface.createFromAsset(getAssets(),
                "fonts/MavenPro-Regular.ttf");

		
		TextView mainText = (TextView) findViewById(R.id.textView1);
		Button pintButton = (Button) findViewById(R.id.button1);
		Button faceButton = (Button) findViewById(R.id.button2);
		Button tryButton = (Button) findViewById(R.id.button3);

		
		mainText.setTypeface(roboto);
		pintButton.setTypeface(maven);
		faceButton.setTypeface(maven);
		tryButton.setTypeface(maven);

		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
