package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonSpiice(View: View) {
        val button_spiice = Intent(this, FirstViewAcivity::class.java)
        startActivity(button_spiice)
    }

    fun loginView(View: View) {
        val loginView = Intent(this, LoginViewActivity::class.java)
        startActivity(loginView)
    }
}