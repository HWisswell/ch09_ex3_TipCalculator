package com.wisswell.tipcalculator;

import android.app.Activity;
import android.os.Bundle;

public class TipCalculatorActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);     
        
        // set the view for the activity using XML
        //setContentView(R.layout.activity_main);

        //display Tip Calculator Fragment
        getFragmentManager().beginTransaction().replace(android.R.id.content, new TipCalculatorFragment()).commit();
    }
}