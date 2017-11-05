package com.odys.kotlintestapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        //println(intent.getStringExtra("description"))

        quit_button.setOnClickListener {
            println("quit. back to MainActivity")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        disableAllButtons()



    }

    fun disableAllButtons() {
        val buttons = listOf(up_button, down_button, north_button, ne_button, east_button,
                se_button, south_button, sw_button, west_button, nw_button)
        buttons.forEach { it.isEnabled = false }
    }
}
