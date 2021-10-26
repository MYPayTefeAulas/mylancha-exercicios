package com.example.teste.MinhaAgendaV4

data class Contato4(var nome: String, var telefone: String, var email: String, var sobreNome: String, var Endereço: String) {
    val id = getProximoId()

    companion object{
        var lastId = -1

    fun getProximoId(): Int{
        return lastId++
         }
    }
}