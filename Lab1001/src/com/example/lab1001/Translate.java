package com.example.lab1001;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Translate extends Activity 
	{
	@Override
	    public void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.animation);
	        ImageView Image1 = (ImageView) findViewById(R.id.ImageView01);
	        Animation Translate = AnimationUtils.loadAnimation(this, R.anim.translate);
	        Image1.startAnimation(Translate);
	    }
	}
