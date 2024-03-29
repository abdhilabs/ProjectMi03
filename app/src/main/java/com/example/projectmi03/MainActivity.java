package com.example.projectmi03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectmi03.helper.SharedPref;

public class MainActivity extends AppCompatActivity {

    Button mBtnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnLogout = findViewById(R.id.bt_logout);

        mBtnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPref.getInstance(MainActivity.this).setLogin(false);
                Intent intent = new Intent(MainActivity.this,SplashActivity.class);
                startActivity(intent);
            }
        });

    }


}
