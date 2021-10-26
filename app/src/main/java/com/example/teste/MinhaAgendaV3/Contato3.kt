package com.example.teste.MinhaAgendaV3

class Contato3(var nome: String, var telefone: String, var email: String) {
    val id = getProximoId()

    companion object{
        var lastId = -1

        fun getProximoId(): Int{
            return lastId++
        }
    }
}