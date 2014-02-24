package com.mcgill.triangledetector.tests;

import com.mcgill.triangledetector.MyFirstTestActivity;
import com.mcgill.triangledetector.R;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyFirstTestActivityTest
		extends ActivityInstrumentationTestCase2<MyFirstTestActivity>
{

	private MyFirstTestActivity mFirstTestActivity;
	private EditText inputA, inputB, inputC, output;
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
		calculateButton = (Button)mFirstTestActivity.findViewById(R.id.button1);
	}
	
	public void testNullActiviey(){
		assertNotNull("mFirstTestActivity is null", mFirstTestActivity);
	}

	public void testNullEditText(){
		assertNotNull("inputA is null", inputA);
		assertNotNull("inputB  is null", inputB);
		assertNotNull("inputC is null", inputC);
		assertNotNull("output is null", output);
	}
	
	public void testNullButton(){
		assertNotNull("CalculateButton is null", calculateButton);
	}
	
	public void testFieldsOnScreen(){
		final View origin = mFirstTestActivity.getWindow().getDecorView();
		ViewAsserts.assertOnScreen(origin, inputA);
		ViewAsserts.assertOnScreen(origin, inputB);
		ViewAsserts.assertOnScreen(origin, inputC);
		ViewAsserts.assertOnScreen(origin, calculateButton);
	}
	
	public void testAlignment(){
		ViewAsserts.assertRightAligned(inputA, inputB);
		ViewAsserts.assertLeftAligned(inputA, inputB);
		ViewAsserts.assertRightAligned(inputB, inputC);
	}
	
	public void testEditTextShouldStartEmpty(){
		assertTrue(inputA.getText().toString().length() == 0);
		assertTrue(inputB.getText().toString().length() == 0);
		assertTrue(inputC.getText().toString().length() == 0);
	}
	
	@UiThreadTest
	public void testGetInput(){
		final String actual = "33";
		inputA.setText(actual);
		calculateButton.performClick();
		final String expected = inputA.getText().toString();
		assertEquals(expected, "33");
	}
	
	public void testInvalidInput(){
		final String inputA = "7";
		final String inputB = "5";
		final String inputC = "10";
		// The expected result returns true if input arguments are integers
		final boolean expected = true;
		boolean actual = mFirstTestActivity.validateInputs(inputA, inputB, inputC);
		assertEquals(expected, actual);
	}
	
	public void testInvalidRange(){
		final String inputA = "50";
		final String inputB = "40";
		final String inputC = "30";
		// The expected result returns true if input arguments are between 1 and 100
		final boolean expected = true; 
		boolean actual = mFirstTestActivity.validateInputRange(inputA, inputB, inputC);
		assertEquals(expected, actual);
 	}
	
	public void testEquilateralTriangle(){
		final String inputA = "15";
		final String inputB = "15";
		final String inputC = "15";
		final boolean expected = true;
		// The expected result returns true if input arguments are the same with each other
		boolean actual = mFirstTestActivity.validateEquilateralTriangle(inputA, inputB, inputC);
		assertEquals(expected, actual);
	}
	
	public void testScaleneTrangle(){
		final String inputA = "3";
		final String inputB = "4";
		final String inputC = "5";
		// The expected result returns true means it is Scalene Trangle.
		final boolean expected = true;
		boolean actual = mFirstTestActivity.validateScaleneTrangle(inputA, inputB, inputC);
		assertEquals(expected, actual);
	}
	
	public void testIsoscelesTriangle(){
		final String inputA = "15";
		final String inputB = "15";
		final String inputC = "5";
		// The expected result returns true means it is Isosceles Triangle.
		final boolean expected = true;
		boolean actual = mFirstTestActivity.validateIsoscelesTriangle(inputA, inputB, inputC);
		assertEquals(expected, actual);
	}
	
	public void testNotTriangle(){
		final String inputA = "100";
		final String inputB = "1";
		final String inputC = "1";
		final boolean expected = true;
		boolean actual = mFirstTestActivity.validateEquilateralTriangle(inputA, inputB, inputC);
		assertEquals(expected, actual);
	}
}
