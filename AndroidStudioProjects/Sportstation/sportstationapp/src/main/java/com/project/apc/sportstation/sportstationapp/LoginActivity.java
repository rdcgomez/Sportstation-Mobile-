package com.project.apc.sportstation.sportstationapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity implements View.OnClickListener {

    private EditText emailText1;
    private EditText passwordText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        Button forgotpasswordBtn = (Button) findViewById(R.id.forgotpasswordBtn);
        Button signup = (Button) findViewById(R.id.signupBtn);
        loginBtn.setOnClickListener(this);
        emailText1 = (EditText) findViewById(R.id.emailText);
        passwordText2 = (EditText) findViewById(R.id.passwordText);

        /*
        switch (Button) {
            case loginBtn:
                setContentView(R.layout.activity_successful_login);
                break;

        }
        */
    }

    @Override
    public void onClick(View v) {
        String email = emailText1.getText().toString();
        String password = passwordText2.getText().toString();
        boolean isError = false;
        if(TextUtils.isEmpty(email)) {
            emailText1.setError(getString(R.string.required_input));
            isError = true;
        }
        if (TextUtils.isEmpty(password)) {
            passwordText2.setError(getString(R.string.required_input));
            isError = true;
        }
        if (!isError) {
            login(email, password);
        }
    }

    private void login(String email, String password) {
        if (email.equals("test") && password.equals("test")) {
            Toast.makeText(getApplicationContext(), "Succesfully Login", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), activity)
        }
        else (email.);{
            Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}
