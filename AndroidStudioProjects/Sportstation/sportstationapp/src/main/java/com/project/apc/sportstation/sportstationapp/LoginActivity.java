package com.project.apc.sportstation.sportstationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText emailText1;
    private EditText passwordText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        Button forgotpasswordBtn = (Button) findViewById(R.id.forgotpasswordBtn);
        emailText1 = (EditText) findViewById(R.id.emailText1);
        passwordText2 = (EditText) findViewById(R.id.passwordText2);

    }
}
