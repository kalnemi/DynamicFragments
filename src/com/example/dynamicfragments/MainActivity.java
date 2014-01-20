package com.example.dynamicfragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button cmdLoad = (Button) findViewById( R.id.btn_load );
		
		cmdLoad.setOnClickListener( new OnClickListener()
		{
			@Override
			public void onClick ( View view )
			{
				FragmentManager fragmentManager = getFragmentManager();
				FragmentTransaction transaction = fragmentManager.beginTransaction(); 
				HelloFragment helloFragment = new HelloFragment(); 
				transaction.add( R.id.fragmentContainer, helloFragment, "Hello" );
				transaction.commit();
			}
		});
	}
}