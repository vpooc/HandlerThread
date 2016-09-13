package com.vpooc.handlerthread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HandlerThread ht = new HandlerThread("ddddssss"){
            @Override
            protected void onLooperPrepared() {
                super.onLooperPrepared();
            }
        };
        Handler mhandlerThread=new Handler(ht.getLooper()){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
            }
        };




    }
}
