package com.teamviperstrike.pennysaved;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;

import android.view.Menu;
import android.widget.TextView;

public class Profile extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
	
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
	 
	    // Update the action bar title with the TypefaceSpan instance
	    ActionBar actionBar = getActionBar();
	    actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.actionbg));
	    int actionBarTitle = Resources.getSystem().getIdentifier("action_bar_title", "id", "android");
	    TextView actionBarTitleView = (TextView) getWindow().findViewById(actionBarTitle);
	    Typeface robotoBoldCondensedItalic = Typeface.createFromAsset(getAssets(), "fonts/MavenPro-Regular.ttf");
	    if(actionBarTitleView != null){
	        actionBarTitleView.setTypeface(robotoBoldCondensedItalic);
	    }
	    actionBarTitleView.setShadowLayer(1.2f, 1.2f, 1.2f, Color.BLACK);
		return true;
	}


}
