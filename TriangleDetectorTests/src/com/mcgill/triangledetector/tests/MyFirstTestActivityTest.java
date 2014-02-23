package com.mcgill.triangledetector.tests;

import com.mcgill.triangledetector.MyFirstTestActivity;
import com.mcgill.triangledetector.R;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

public class MyFirstTestActivityTest
		extends ActivityInstrumentationTestCase2<MyFirstTestActivity>
{

	private MyFirstTestActivity mFirstTestActivity;
	private EditText inputA, inputB, inputC;
	
	
	public MyFirstTestActivityTest() {
		super(MyFirstTestActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception
	{
		super.setUp();
		mFirstTestActivity = getActivity();
	}
	
	public void testNullActiviey(){
		assertNotNull("mFirstTestActivity is null", mFirstTestActivity);
	}
	
	public void testNullEditText(){
		assertNotNull(inputA);
		assertNotNull(inputB);
		assertNotNull(inputC);
	}
}
