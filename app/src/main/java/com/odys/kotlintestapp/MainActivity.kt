package com.odys.kotlintestapp

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_button.setOnClickListener {
            Toast.makeText(this, "start button clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
            finish()
        }

        exit_button.setOnClickListener {
            Toast.makeText(this, "exit button clicked", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
