package com.example.android.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
    }

    fun goToJava(view: View?) {
        startActivity(Intent("com.example.android.app.action.JAVA_PAGE"))
    }
}
