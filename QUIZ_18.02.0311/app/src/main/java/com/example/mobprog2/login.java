package com.example.mobprog2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    Button mBtnlogin;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);

        mBtnlogin = findViewById(R.id.login);

        mBtnlogin.setOnContextClickListener((v))
                SharedPref.getInstance(login.this).setLogin(true);
                username.getText();

                if (username)

                    Intent intent = new Intent( createPackageContext(login.this))
                    startActivity(intent);
    }
}
