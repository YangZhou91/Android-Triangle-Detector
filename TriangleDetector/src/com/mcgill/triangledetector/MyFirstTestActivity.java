package com.mcgill.triangledetector;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyFirstTestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText inputA = (EditText)this.findViewById(R.id.editText1);
        EditText inputB = (EditText)this.findViewById(R.id.editText2);
        EditText inputC = (EditText)this.findViewById(R.id.editText3);
        Button calculateButton = (Button)this.findViewById(R.id.button1);
       /* 
        calculateButton.setOnClickListener(
        		new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Log.v("EditText", inputA.getText().toString());
					}
        		}
        		);
        */
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public boolean validateInputs(String a, String b, String c){
    	try {
    		Integer.parseInt(a);
    		Integer.parseInt(b);
    		Integer.parseInt(c);
    	} catch(NumberFormatException e){
    		return false;
    	}
    	return true;
    }
    
    public boolean validateInputRange(String a, String b, String c){
    	int lengthA = Integer.parseInt(a); 
    	int lengthB = Integer.parseInt(b);
    	int lengthC = Integer.parseInt(c);
    	
    	if (lengthA < 1 || lengthB < 1 || lengthC < 1){
    		return false;
    	}
    	else if (lengthA > 100 || lengthB > 100 || lengthC > 100){
			return false;
		}
    	else{
    		return true;
    	}
    }


	public boolean validateEquilateralTriangle(String a, String b, String c) {
		// TODO Auto-generated method stub
		return false;
	}
}

