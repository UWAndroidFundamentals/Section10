package com.example.lab1001;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Sequential extends Activity 
	{
	@Override
	    public void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.animation);
	        ImageView Image1 = (ImageView) findViewById(R.id.ImageView01);
	        Animation Sequential = AnimationUtils.loadAnimation(this, R.anim.sequential);
	        Image1.startAnimation(Sequential);
	    }
	}
