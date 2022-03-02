package com.example.atividade1

import java.util.*
import java.util.Random

class Sorteio(){

    val random = Random()
    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from // from(incluso) e to(excluso)
    }
}