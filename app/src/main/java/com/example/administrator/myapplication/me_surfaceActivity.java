package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class me_surfaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_surface);
//        ImageView imageView18=(ImageView)findViewById(R.id.imageView18);
//       imageView18.setOnClickListener(this);
    }
    public void onClick(View view){
        Intent intent=new Intent(me_surfaceActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
