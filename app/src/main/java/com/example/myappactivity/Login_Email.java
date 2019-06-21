package com.example.myappactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Login_Email extends AppCompatActivity {
    EditText uname,upass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__email);
        uname=findViewById(R.id.useName);
        upass=findViewById(R.id.userPassword);
       Intent i=new Intent(Login_Email.this,Home_Activity.class);
        startActivity(i);
    }
}
