package com.example.study.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class SumApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_app);

        Intent intent=getIntent();
        String result= intent.getStringExtra(MainActivity.Result);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(result);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_sum_app);
        layout.addView(textView);
    }
}
