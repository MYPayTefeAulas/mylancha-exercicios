package com.example.teste.MinhaAgendaV1

data class Contatos(var nome: String, var telefone: String) {
    val id = getProximoId()

    companion object{
        var lastId = -1

    fun getProximoId():Int{
        return lastId
        }
    }
}