package com.mcgill.triangledetector;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;

public class MyFirstTestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText inputA = (EditText)this.findViewById(R.id.editText1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

