package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code for splashscreen
        Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(5*1000);
                    startActivity(new Intent(MainActivity.this,calculatorDashboard.class));
                    finish();
                }catch(Exception e){
                    e.printStackTrace();
                }
                super.run();
            }
        };thread.start();
    }
}