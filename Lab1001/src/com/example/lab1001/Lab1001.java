package com.example.lab1001;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Lab1001 extends Activity implements OnItemClickListener {

	  @Override
	    public void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.screen001);
	       
	        // Retrieve the existing ListView that you already defined
	        ListView menuList = (ListView) findViewById(R.id.ListView_Menu);      
	       
	        // Create an array of menu text items from resource file
	        String[] items = 
	        	{ 
	        	"Rotate",
	        	"FadeIn",
	        	"Scale",
	        	"Translate",
	        	"Interpolator",
	        	"Sequential"
	        	};

	        // Create a data adapter 
	        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.main_textview, items);
	        
	        // Link the data adapter to the menu list 
	        menuList.setAdapter(adapt);
	        
	        // Set listener to capture user selection
	        menuList.setOnItemClickListener(this);
	        
	    }
	    
	    public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) 
	    {
	    	TextView textView = (TextView) itemClicked;
	    	String strText = textView.getText().toString();
	    	if (strText.equalsIgnoreCase("Rotate")) 
	    	{
	    		startActivity(new Intent(Lab1001.this, Rotate.class));
	    	} 
	    	if (strText.equalsIgnoreCase("FadeIn")) 
	    	{
	    		startActivity(new Intent(Lab1001.this, Fade.class));
	    	}
	    	if (strText.equalsIgnoreCase("Scale")) 
	    	{
	    		startActivity(new Intent(Lab1001.this, Scale.class));
	    	}
	    	if (strText.equalsIgnoreCase("Translate")) 
	    	{
	    		startActivity(new Intent(Lab1001.this, Translate.class));
	    	}

	    	if (strText.equalsIgnoreCase("Interpolator")) 
	    	{
	    		startActivity(new Intent(Lab1001.this, Interpolator.class));
	    	}

	    	if (strText.equalsIgnoreCase("Sequential")) 
	    	{
	    		startActivity(new Intent(Lab1001.this, Sequential.class));
	    	}
	    	
	    }	

      



}
