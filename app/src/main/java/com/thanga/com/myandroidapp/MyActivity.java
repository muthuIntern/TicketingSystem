package com.thanga.com.myandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.thanga.com.myandroidapp.MESSAGE";
    public static final String EXTRA_PASS = "com.thanga.com.myandroidapp.PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String username = editText.getText().toString();
        EditText editText1 = (EditText) findViewById(R.id.editPassword);
        String password = editText1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, username);
        intent.putExtra(EXTRA_PASS, password);
        startActivity(intent);
    }
}
