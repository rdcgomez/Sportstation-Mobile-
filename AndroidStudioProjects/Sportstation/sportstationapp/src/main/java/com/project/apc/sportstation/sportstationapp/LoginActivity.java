package com.project.apc.sportstation.sportstationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        emailText1 = (EditText) findViewById(R.id.emailText);
        passwordText2 = (EditText) findViewById(R.id.passwordText);

        /*
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(emailText.getText().toString(), passwordText.getText().toString());
            }
        });
        forgotpasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return();
            }
        });

        private void validate (String userEmail, String userPassword){
            if ((userEmail.equals("sample@gmail.com")) && (userPassword.equals("password"))){
                Intent intent = new Intent(LoginSportstation.this, HomeSportstation.class);
                startActivity(intent);
            }
        }
        */

    }
}
