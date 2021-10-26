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
                Contato3("01 luis", "0800", "luis@maypay.com"),
                Contato3("02 luis", "0800", "luis@maypay.com"),
                Contato3("03 luis", "0800", "luis@maypay.com"),
                Contato3("04 luis", "0800", "luis@maypay.com"),
                Contato3("05 luis", "0800", "luis@maypay.com"),
                Contato3("06 luis", "0800", "luis@maypay.com"),
                Contato3("07 luis", "0800", "luis@maypay.com"),
                Contato3("08 luis", "0800", "luis@maypay.com"),
                Contato3("09 luis", "0800", "luis@maypay.com"),
                Contato3("10 luis", "0800", "luis@maypay.com"),
                Contato3("11 luis", "0800", "luis@maypay.com"),
                Contato3("12 luis", "0800", "luis@maypay.com"),
                Contato3("13 luis", "0800", "luis@maypay.com"),
                Contato3("14 luis", "0800", "luis@maypay.com"),
                Contato3("15 luis", "0800", "luis@maypay.com"),
                Contato3("16 luis", "0800", "luis@maypay.com"),
                Contato3("17 luis", "0800", "luis@maypay.com"),
                Contato3("18 luis", "0800", "luis@maypay.com"),
                Contato3("19 luis", "0800", "luis@maypay.com"),
                Contato3("20 luis", "0800", "luis@maypay.com"),
                Contato3("21 luis", "0800", "luis@maypay.com"),
                Contato3("22 luis", "0800", "luis@maypay.com"),
                Contato3("23 luis", "0800", "luis@maypay.com"),
                Contato3("24 luis", "0800", "luis@maypay.com"),
                Contato3("25 luis", "0800", "luis@maypay.com"),
                Contato3("26 luis", "0800", "luis@maypay.com"),
                Contato3("27 luis", "0800", "luis@maypay.com"),
                Contato3("28 luis", "0800", "luis@maypay.com"),
                Contato3("29 luis", "0800", "luis@maypay.com"),
                Contato3("30 luis", "0800", "luis@maypay.com"),

            )
        )

    }
}