package com.example.malai_pt1882.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();


        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView4);
        textView.setText(intent.getData().toString());

        //TODO - displaying intent action
        //intent.getAction();
    }

}
