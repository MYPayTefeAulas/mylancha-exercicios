package com.example.teste.MinhaAgendaV2

data class Contato2(var nome: String, var telefone: String) {
    //val id = getProximoId()

    override fun toString(): String {
        return "$nome ($telefone)"
    }

    //companion object{
        //var lastId = -1

        //fun getProximoId(): Int{
          //  return lastId++
       // }
   // }
}