package com.example.teste.MinhaAgendaV3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teste.databinding.ActivityTelaInicial3Binding

class TelaInicial3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTelaInicial3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaInicial3Binding.inflate(layoutInflater)

        inicializaLista()

        binding.rvContatos3.layoutManager = LinearLayoutManager(this)
        binding.rvContatos3.adapter = ContatoAdapter(Agenda3.listaContatos3)
        binding.rvContatos3.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        setTitle("Agenda 03")

        setContentView(binding.root)
    }

    private fun inicializaLista(){
        Agenda3.listaContatos3.addAll(
            listOf(
                Contato3("1 luis", " 01"),
                Contato3("2 felipe", "01"),
                Contato3("3 inacio", "01"),
                Contato3("4 conceição", "01"),
                Contato3("5 luiz", "01"),
                Contato3("6 flfhfj", "01"),
                Contato3("7 luis", "01"),
                Contato3("8 luis", "01"),
                Contato3("9 luis", "01"),
                Contato3("10 luis", "01"),
                Contato3("11 luis", "01"),
                Contato3("12 luis", "01"),
                Contato3("13 luis", "01"),
                Contato3("14 luis", "01")



            )
        )

    }
}