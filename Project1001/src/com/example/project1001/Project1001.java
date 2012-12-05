package com.example.project1001;

import android.os.Bundle;
import android.app.Activity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Project1001 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen001);
        /*****************
         * TODO: 
         * (1) Create ImageView variable by casting findViewByID from R.id.ImageView01
         * (2) Create Automation variable by calling AnimationUtils.loadAnimation passing "this" and "R.anim.myset"
         * (3) Call "startAnimation" method on ImageView variable and pass automation variable
         */
    }


}
