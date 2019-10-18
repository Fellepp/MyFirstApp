package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button*/
    public void sendMessage(View view){
        // Do something in response to button

        //Takes context and class parameters. Context first because Activity class is a subclass of Context
        //Class parameter of app component, to which the system delivers the Intent (the activity to start)
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        //putExtra() adds the value of EditText to the Intent
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
