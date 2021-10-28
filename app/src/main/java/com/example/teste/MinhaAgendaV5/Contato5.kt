package com.example.teste.MinhaAgendaV5

class Contato5(var nome: String, var telefone: String, var SobreNome: String,
var email: String, var endereço : String) {
    val id = getProximoId()

    companion object
    var lastId = -1

    fun getProximoId(): Int{
        return lastId++
    }
}