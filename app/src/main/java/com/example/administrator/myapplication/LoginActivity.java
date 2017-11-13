package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/10/19.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView Login_TextView_Send=(TextView)findViewById(R.id.Login_TextView_Send);
        Login_TextView_Send.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent( LoginActivity.this,MainActivity.class);
        startActivity(intent);
    }
//    public void onClick(View v){
//        Intent intent=new Intent( LoginActivity.this,MainActivity.class);
//        startActivity(intent);
//    }

}
