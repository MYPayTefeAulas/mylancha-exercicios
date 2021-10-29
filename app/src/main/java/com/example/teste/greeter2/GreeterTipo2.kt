package com.example.teste.greeter2

class GreeterTipo2(val cumprimentoNome: String, val cumprimentoIdade: String) {


    fun greett1(nome: String): String {
        val cumprimento1 = "$cumprimentoNome $nome"
        return cumprimento1
    }

    fun greett2(Idade: String): String {
        val cumprimento2 = "$cumprimentoIdade $Idade"
        return cumprimento2
    }


}

