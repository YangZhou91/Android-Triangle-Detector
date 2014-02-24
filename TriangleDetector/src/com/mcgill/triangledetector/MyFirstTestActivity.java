package com.mcgill.triangledetector;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MyFirstTestActivity extends Activity {

	EditText inputA;
	EditText inputB;
	EditText inputC;
	TextView output;
	Button calculateButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputA = (EditText)this.findViewById(R.id.editText1);
        inputB = (EditText)this.findViewById(R.id.editText2);
        inputC = (EditText)this.findViewById(R.id.editText3);
        output = (TextView)this.findViewById(R.id.textView1);
        calculateButton = (Button)this.findViewById(R.id.button1);
        calculateButton.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View v) {
        		String valueA = inputA.getText().toString();
        		String valueB = inputB.getText().toString();
        		String valueC = inputC.getText().toString();
        		
        		if (!validateEmpty(valueA,valueB,valueC)){
        			output.setText("Please enter all three values");
        		}
        		else if (!validateInputs(valueA,valueB,valueC)&&validateEmpty(valueA, valueB, valueC)){
        			output.setText("Please enter NUMBER!");	
        		}
        		else if (!validateInputRange(valueA,valueB,valueC)){
        			output.setText("Please enter values between 1 and 100!");	
        		}
        		else if (validateEquilateralTriangle(valueA,valueB,valueC)){
        			output.setText("Equilateral Triangle");	
        		}
        		
        	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public boolean validateEmpty(String inputA, String inputB, String inputC){
    	if (inputA.length() == 0 || inputB.length() == 0 || inputC.length() ==0)
    		return false;
    		
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
		int lengthA = Integer.parseInt(a); 
    	int lengthB = Integer.parseInt(b);
    	int lengthC = Integer.parseInt(c);
    	
		if (lengthA == lengthB && lengthB == lengthC && lengthC == lengthA){
			return true;
		}
		else {
		return false;
		}
	}


	public boolean validateScaleneTrangle(String inputA, String inputB, String inputC) {
		int lengthA = Integer.parseInt(inputA); 
    	int lengthB = Integer.parseInt(inputB);
    	int lengthC = Integer.parseInt(inputC);
    	
		if (lengthA != lengthB && lengthA != lengthC && lengthB != lengthC){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean validateIsoscelesTriangle(String inputA, String inputB, String inputC) {
		int lengthA = Integer.parseInt(inputA); 
    	int lengthB = Integer.parseInt(inputB);
    	int lengthC = Integer.parseInt(inputC);
    	
    	if (lengthA == lengthB && lengthB != lengthC){
    		return true;
    	}
    	if (lengthA == lengthC && lengthB != lengthC){
    		return true;
    	}
    	if (lengthB == lengthC && lengthA != lengthC){
    		return true;
    	}
    	else {
    		return false;
    	}
	}
	
	public boolean validateNotTriangle(String inputA, String inputB, String inputC) {
		int lengthA = Integer.parseInt(inputA); 
    	int lengthB = Integer.parseInt(inputB);
    	int lengthC = Integer.parseInt(inputC);
    	
    	if ((lengthA+lengthB > lengthC) && (lengthA+lengthC > lengthB) && (lengthC+lengthB > lengthA)){
    		return true;
    	}
    	else {
    		return false;
    	}
	}
	
	
	
}

