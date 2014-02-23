package com.mcgill.triangledetector.tests;

import com.mcgill.triangledetector.MyFirstTestActivity;
import com.mcgill.triangledetector.R;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class MyFirstTestActivityTest
		extends ActivityInstrumentationTestCase2<MyFirstTestActivity>
{

	private MyFirstTestActivity mFirstTestActivity;
	private TextView mFirstTestText;
	
	public MyFirstTestActivityTest() {
		super(MyFirstTestActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception
	{
		super.setUp();
		mFirstTestActivity = getActivity();
		mFirstTestText = (TextView) mFirstTestActivity.findViewById(R.id.my_first_text_view);
	}
	
	public void testPreconditions(){
		assertNotNull("mFirstTestActivity is null", mFirstTestActivity);
		assertNotNull("mFirstTestText is null, mFirstTextTest");
	}
	
	public void testMyFirstTestTextView_labelText(){
		final String expected = mFirstTestActivity.getString(R.string.my_first_test);
		final String actual = mFirstTestText.getText().toString();
		assertEquals(expected, actual);
	}
}
