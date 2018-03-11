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

        game()

    }

    fun disableAllButtons() {
        val buttons = listOf(up_button, down_button, north_button, ne_button, east_button,
                se_button, south_button, sw_button, west_button, nw_button)
        buttons.forEach { it.isEnabled = false }
    }

    fun game() {
        val locations = readLocationInfo(applicationContext.assets.open("locations.txt").reader(),
                applicationContext.assets.open("directions.txt").reader())
        var loc = 64
        var location = locations[loc] ?: Location(0,
                    "Sorry, something went wrong, so the game will terminate")

        buttonUpdate(location)

        quit_button.setOnClickListener {
            loc=0
            location = locations[loc]!!
            Toast.makeText(this, location.description, Toast.LENGTH_LONG).show()
            disableAllButtons()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        up_button.setOnClickListener {
            loc = location.exits["U"]!!
            location = locations[loc]!!
            buttonUpdate(location)
        }

        down_button.setOnClickListener {
            loc = location.exits["D"]!!
            location = locations[loc]!!
            buttonUpdate(location)
        }

        north_button.setOnClickListener {
            loc = location.exits["N"]!!
            location = locations[loc]!!
            buttonUpdate(location)
        }

        south_button.setOnClickListener {
            loc = location.exits["S"]!!
            location = locations[loc]!!
            buttonUpdate(location)
        }

        east_button.setOnClickListener {
            loc = location.exits["E"]!!
            location = locations[loc]!!
            buttonUpdate(location)
        }

        west_button.setOnClickListener {
            loc = location.exits["W"]!!
            location = locations[loc]!!
            buttonUpdate(location)
        }

        ne_button.setOnClickListener {
            loc = location.exits["NE"]!!
            location = locations[loc]!!
            buttonUpdate(location)
        }

        nw_button.setOnClickListener {
            loc = location.exits["NW"]!!
            location = locations[loc]!!
            buttonUpdate(location)
        }

        se_button.setOnClickListener {
            loc = location.exits["SE"]!!
            location = locations[loc]!!
            buttonUpdate(location)
        }

        sw_button.setOnClickListener {
            loc = location.exits["SW"]!!
            location = locations[loc]!!
            buttonUpdate(location)
        }

    }

    fun buttonUpdate(location: Location) {
        description.text = location.description
        disableAllButtons()
        location.exits.keys.forEach {
            when(it) {
                "U" -> up_button.isEnabled = true
                "D" -> down_button.isEnabled = true
                "N" -> north_button.isEnabled = true
                "S" -> south_button.isEnabled = true
                "E" -> east_button.isEnabled = true
                "W" -> west_button.isEnabled = true
                "NE" -> ne_button.isEnabled = true
                "NW" -> nw_button.isEnabled = true
                "SE" -> se_button.isEnabled = true
                "SW" -> sw_button.isEnabled = true
            }
        }
    }
}
