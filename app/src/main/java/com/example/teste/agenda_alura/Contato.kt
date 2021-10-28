package com.example.teste.agenda_alura

import com.example.teste.arena.Pesssoa

class Contato(val nome: String, val telefone: String) {

    private val listaContato = mutableListOf<Pesssoa>()
    private var indiceAtual = 0


    fun verificaContato(contato: Pesssoa): String {
        var testeContato : String = "false"
        indiceAtual = 0
        for (lista in listaContato){
            if (lista.nome == contato.nome){
                testeContato = contato.nome
                break
            }else if(lista.telefone == contato.telefone){
                testeContato = contato.telefone
               break
            }

            }
        return testeContato
        }



    fun verificaNumero() {


    }

    fun deletar(){
        listaContato.removeAt(indiceAtual)
        indiceAtual--



    }

}



