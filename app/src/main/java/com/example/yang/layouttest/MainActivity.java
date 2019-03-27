package com.example.yang.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.layout);
        //setContentView(R.layout.linearlayout);
        setContentView(R.layout.tablelayout);
    }
}
