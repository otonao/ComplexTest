package com.example.ninomiya.complextest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    Model m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m.first(new Callback(){
            @Override
            public void onDone() {
                m.second(new Callback(){
                    @Override
                    public void onDone() {
                        System.out.println("FINISH");
                    }
                });
            }
        });
    }
}
