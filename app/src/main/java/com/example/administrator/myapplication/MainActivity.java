package com.example.administrator.myapplication;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ImageView me_back=(ImageView)findViewById(R.id.me_back);
        me_back.setOnClickListener(this);
        ImageView faxian_back=(ImageView)findViewById(R.id.faxian_back);
        faxian_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,me_surfaceActivity.class);
        startActivity(intent);

    }



    }




