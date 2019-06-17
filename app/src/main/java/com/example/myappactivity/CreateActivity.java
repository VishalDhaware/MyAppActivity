package com.example.myappactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateActivity extends AppCompatActivity {
    Button btn_email,btn_facebook,btn_google;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        btn_email=findViewById(R.id.btn_email);
        btn_facebook=findViewById(R.id.btn_facebook);
        btn_google=findViewById(R.id.btn_google);
        res=findViewById(R.id.txt_sing);
        btn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreateActivity.this,RegisterEmailActivity.class);
                startActivity(intent);
            }
        });
        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreateActivity.this,Register_Google.class);
                startActivity(intent);
            }
        });
        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreateActivity.this,Register_Facebook.class);
                startActivity(intent);
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreateActivity.this,MainActivity.class);
    startActivity(intent);
}
        });
                }
                }
