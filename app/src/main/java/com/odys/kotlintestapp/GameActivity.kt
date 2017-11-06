package com.odys.kotlintestapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        quit_button.setOnClickListener {
            Toast.makeText(this, "quit. back to MainActivity", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        disableAllButtons()

        game()

    }

    fun disableAllButtons() {
        val buttons = listOf(up_button, down_button, north_button, ne_button, east_button,
                se_button, south_button, sw_button, west_button, nw_button)
        buttons.forEach { it.isEnabled = false }
    }

    fun game() {
        //val locations = readLocationInfo()
        var loc = 0//64

//        while (true) {
//
//            val location = locations[loc] ?: Location(0,
//                    "Sorry, something went wrong, so the game will terminate")

            description.text = "nana"//println(location.description)

//            if (location.locationID == 0) {
//                break
//            }
//
//            print("Available exits are: ")
//            location.exits.keys.forEach {
//                print("$it ")
//            }
//
//            val direction = readLine()?.toUpperCase() ?: "Z"
//            if (location.exits.containsKey(direction)) {
//                loc = location.exits[direction]!!
//            }
//            else {
//                println("You can't go in that direction")
//            }
//
//
//        }
    }
}
