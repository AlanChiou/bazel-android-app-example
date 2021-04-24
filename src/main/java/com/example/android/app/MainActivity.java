package com.example.android.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public final class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToKotlin(View view) {
        startActivity(new Intent("com.example.android.app.action.KOTLIN_PAGE"));
    }
}