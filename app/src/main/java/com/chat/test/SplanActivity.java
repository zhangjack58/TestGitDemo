package com.chat.test;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class SplanActivity extends AppCompatActivity {


    public static  void toActivity(Context context){
        Intent intent = new Intent(context,SplanActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splan);

    }

}
