package com.example.johnathonwalker.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SharedScriptureDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_scripture_display);

        Intent intent = getIntent();
        String scripture = intent.getStringExtra(MainActivity.SHARED_SCRIPTURE);
        TextView textView = (TextView) findViewById(R.id.scripture);
        textView.setText(scripture);
    }
}
