package com.example.teste.sorteioDeDados
import java.util.Random

class Dados(var lados: Int) {
    val random = Random()

    fun rolar(): Int{
        return (1..lados).random()
        random.nextInt(lados -1)
    }
}