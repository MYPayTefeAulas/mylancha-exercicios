package com.example.teste.MinhaAgendaV6

data class Contato6(var nome: String, var sobrenome: String, var telefone: String, var email: String, var endereço: String) {
    val id = getProximoId()

    companion object {
        var lastId = -1

        fun getProximoId(): Int {
            return lastId++
        }
    }
}