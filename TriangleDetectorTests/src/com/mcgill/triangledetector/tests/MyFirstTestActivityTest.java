package com.mcgill.triangledetector.tests;

import com.mcgill.triangledetector.MyFirstTestActivity;
import com.mcgill.triangledetector.R;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

public class MyFirstTestActivityTest
		extends ActivityInstrumentationTestCase2<MyFirstTestActivity>
{

	private MyFirstTestActivity mFirstTestActivity;
	private EditText inputA, inputB, inputC;
	private Button calculateButton;
	
	
	public MyFirstTestActivityTest() {
		super(MyFirstTestActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception
	{
		super.setUp();
		mFirstTestActivity = this.getActivity();
		inputA = (EditText)mFirstTestActivity.findViewById(R.id.editText1);
		inputB = (EditText)mFirstTestActivity.findViewById(R.id.editText2);
		inputC = (EditText)mFirstTestActivity.findViewById(R.id.editText3);
	}
	
	public void testNullActiviey(){
		assertNotNull("mFirstTestActivity is null", mFirstTestActivity);
	}

	public void testNullEditText(){
		assertNotNull("inputA is null", inputA);
		assertNotNull("inputB  is null", inputB);
		assertNotNull("inputC is null", inputC);
	}
	
	public void testNullButton(){
		assertNotNull("CalculateButton is null", calculateButton);
	}
}
