package com.example.tb_portolio;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	LinearLayout sebastianButton, teresiaButton, jonathanButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        teresiaButton = (LinearLayout)findViewById(R.id.teresia); 
        teresiaButton.setOnClickListener(new View.OnClickListener() 
        	{ 
        public void onClick(View v) 
        	{
        		Intent intent = new Intent(MainActivity.this, teresia.class); startActivity(intent);
        			} 
        		}); 
    
        sebastianButton = (LinearLayout)findViewById(R.id.sebastian); 
        sebastianButton.setOnClickListener(new View.OnClickListener() 
        	{ 
        public void onClick(View v) 
        	{
        		Intent intent = new Intent(MainActivity.this, sebastian.class); startActivity(intent);
        			} 
        		}); 
        
        jonathanButton = (LinearLayout)findViewById(R.id.jonathan); 
        jonathanButton.setOnClickListener(new View.OnClickListener() 
        	{ 
        public void onClick(View v) 
        	{
        		Intent intent = new Intent(MainActivity.this, jonathan.class); startActivity(intent);
        			} 
        		}); 
    

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
  
  
    	}
    

