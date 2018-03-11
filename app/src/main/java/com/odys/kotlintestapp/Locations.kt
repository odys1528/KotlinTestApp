package com.odys.kotlintestapp

import java.io.Reader

fun readLocationInfo(reader1: Reader, reader2: Reader) : Map<Int, Location> {

    val locations = mutableMapOf<Int, Location>()

    reader1.forEachLine {
        val tokens = it.split("`")
        val location = Location(tokens[0].toInt(), tokens[1])
        locations[location.locationID] = location
    }

    reader2.forEachLine {
        val tokens = it.split(",")
        locations[tokens[0].toInt()]?.addExit(tokens[1], tokens[2].toInt())
    }

    return locations

}