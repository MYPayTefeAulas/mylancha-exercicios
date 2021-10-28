package com.example.teste.greeter

import com.example.teste.greeter2.Pessoa

class GreeterTipo1(val cumprimento: String, val sinal : String){


    fun greet(nome: String): String {
        val cumprimentoCompleto = "$cumprimento $nome $sinal "

        return cumprimentoCompleto
    }
}