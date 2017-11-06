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

        game()

    }

    fun disableAllButtons() {
        val buttons = listOf(up_button, down_button, north_button, ne_button, east_button,
                se_button, south_button, sw_button, west_button, nw_button)
        buttons.forEach { it.isEnabled = false }
    }

    fun game() {
        val locations = readLocationInfo(applicationContext.assets.open("locations_big.txt").reader(),
                applicationContext.assets.open("directions_big.txt").reader())
        var loc = 64
        var location = locations[loc] ?: Location(0,
                    "Sorry, something went wrong, so the game will terminate")

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

        if (location.locationID == 0) {
            disableAllButtons()
        }

        up_button.setOnClickListener {
            Toast.makeText(this, "up", Toast.LENGTH_SHORT).show()
            loc = location.exits["U"]!!
            location = locations[loc]!!
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

        down_button.setOnClickListener {
            Toast.makeText(this, "down", Toast.LENGTH_SHORT).show()
            loc = location.exits["D"]!!
            location = locations[loc]!!
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

        north_button.setOnClickListener {
            Toast.makeText(this, "north", Toast.LENGTH_SHORT).show()
            loc = location.exits["N"]!!
            location = locations[loc]!!
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

        south_button.setOnClickListener {
            Toast.makeText(this, "south", Toast.LENGTH_SHORT).show()
            loc = location.exits["S"]!!
            location = locations[loc]!!
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

        east_button.setOnClickListener {
            Toast.makeText(this, "east", Toast.LENGTH_SHORT).show()
            loc = location.exits["E"]!!
            location = locations[loc]!!
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

        west_button.setOnClickListener {
            Toast.makeText(this, "west", Toast.LENGTH_SHORT).show()
            loc = location.exits["W"]!!
            location = locations[loc]!!
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

        ne_button.setOnClickListener {
            Toast.makeText(this, "north-east", Toast.LENGTH_SHORT).show()
            loc = location.exits["NE"]!!
            location = locations[loc]!!
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

        nw_button.setOnClickListener {
            Toast.makeText(this, "north-west", Toast.LENGTH_SHORT).show()
            loc = location.exits["NW"]!!
            location = locations[loc]!!
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

        se_button.setOnClickListener {
            Toast.makeText(this, "south-east", Toast.LENGTH_SHORT).show()
            loc = location.exits["SE"]!!
            location = locations[loc]!!
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

        sw_button.setOnClickListener {
            Toast.makeText(this, "south-west", Toast.LENGTH_SHORT).show()
            loc = location.exits["SW"]!!
            location = locations[loc]!!
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
}
