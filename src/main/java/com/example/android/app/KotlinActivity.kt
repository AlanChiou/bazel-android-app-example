package com.example.android.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class KotlinActivity: Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
    }

    fun goToJava(view: View?) {
        startActivity(Intent("com.example.android.app.action.JAVA_PAGE"))
    }
}