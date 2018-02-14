package com.example.malai_pt1882.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.malai-pt1882.MyApplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //on send button click this method will execute
    public void sendMessage(View view) {

        // implicit intent - mentioning activity class name DispalyMessageActivity
        Intent intent = new Intent();

        //setting action to intent - implicit intent
        intent.setAction(Intent.ACTION_SEND);

        Intent chooser = Intent.createChooser(intent, "Share with");

        //chekcing whether the android system has that action or any other apps having similar action is there
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(chooser);
        } else {
            //expicit intent - mentioning the component name displayMessageActivity
            intent = new Intent(this, DisplayMessageActivity.class);

            //getting the data from the text field
            EditText editText = (EditText) findViewById(R.id.editText);
            String message = editText.getText().toString();

            //adding data to intent
            intent.putExtra(EXTRA_MESSAGE, message);

            //calling the DisplayMessageActivity
            startActivity(intent);
        }
    }
}

