package com.example.iskandarjava.suratbebaslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v)
    {
        Intent intent= new Intent(Login.this, MainActivity.class);
        startActivity(intent);
    }

}
