package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {
    TextView textView;
    TextView remsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        textView = (TextView) findViewById(R.id.textView);
        remsg = (TextView) findViewById(R.id.rcv);

        Intent intent2 = getIntent();
        String str = intent2.getStringExtra("message");

        remsg.setText(str);
    }
}