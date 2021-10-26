package com.example.teste.MinhaAgendaV1

import android.provider.ContactsContract

data class Contatos(var nome: String, var telefone: String, var email: String) {
    val id = getProximoId()

    companion object{
        var lastId = -1

    fun getProximoId():Int{
        return lastId
        }
    }
}