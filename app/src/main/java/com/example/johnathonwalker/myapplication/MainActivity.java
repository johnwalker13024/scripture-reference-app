package com.example.johnathonwalker.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String SHARED_SCRIPTURE =
            "com.example.johnathonwalker.myapplication.SHARED_SCRIPTURE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void share(View view) {
        Intent intent = new Intent(this, SharedScriptureDisplay.class);
        TextView book = (TextView) findViewById(R.id.book);
        TextView chapter = (TextView) findViewById(R.id.chapter);
        TextView verse = (TextView) findViewById(R.id.verse);
        StringBuilder sb = new StringBuilder(book.getText() + " " +
                                             chapter.getText() + ":" +
                                             verse.getText());
        intent.putExtra(SHARED_SCRIPTURE, sb.toString());
        startActivity(intent);
    }
}
