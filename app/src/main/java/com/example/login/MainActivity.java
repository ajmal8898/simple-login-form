package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextUserName, editTextPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUserName = (EditText) findViewById(R.id.editTextUserName);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String userName = editTextUserName.getText().toString();
        String userPassword = editTextPassword.getText().toString();
        if (userName.isEmpty()) {
            editTextUserName.setError("Field cannot be empty");
        } else if (userPassword.isEmpty()) {
            editTextPassword.setError("Field cannot be empty");
        } else {
            validateLogin(userName, userPassword);
        }
    }

    private void validateLogin(String userName, String userPassword) {
        if (userName.equals("admin") && userPassword.equals("1234")) {
            String admin = editTextUserName.getText().toString();
            Intent intent = new Intent(this, SuccessActivity.class);
            intent.putExtra("message", admin);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Failed Attempt!", Toast.LENGTH_LONG).show();
        }
    }

}
