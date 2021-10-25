package com.example.teste.MinhaAgendaV4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teste.databinding.ActivityTelaInicial4Binding

class TelaInicial4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTelaInicial4Binding
    private lateinit var adapter: ContatoAdapter4


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    binding = ActivityTelaInicial4Binding.inflate(layoutInflater)

        inicializaLista()

        setTitle("Agenda 04")

        adapter = ContatoAdapter4(mutableListOf(), ::onBtEditarClick)

        binding.rvContatos4.layoutManager = LinearLayoutManager(this)
        binding.rvContatos4.adapter = adapter
        binding.rvContatos4.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        adapter.swapData(Agenda4.listaContatos4)

        setContentView(binding.root)



    }
    private fun inicializaLista(){
        Agenda4.listaContatos4.addAll(
            listOf(
                Contato4("1 Luis", "01"),
                Contato4("2 Luis", "01"),
                Contato4("3 Luis", "01"),
                Contato4("4 Luis", "01"),
                Contato4("5 Luis", "01"),
                Contato4("6 Luis", "01"),
                Contato4("7 Luis", "01"),
                Contato4("8 Luis", "01"),
                Contato4("9 Luis", "01"),
                Contato4("10 Luis", "01"),
                Contato4("11 Luis", "01"),
                Contato4("12 Luis", "01"),
                Contato4("13 Luis", "01"),
                Contato4("14 Luis", "01"),
                Contato4("15 Luis", "01"),
                Contato4("16 Luis", "01"),
                Contato4("17 Luis", "01"),
                Contato4("18 Luis", "01"),
                Contato4("19 Luis", "01"),
                Contato4("2o Luis", "01"),
            )
        )
    }


    fun onBtEditarClick(indiceLista: Int){
        val intent = Intent(this,EditarContato4Activity::class.java )
        intent.putExtra("indiceContato", indiceLista)
        startActivity(intent)

    }

    override fun onResume() {
        super.onResume()
        adapter.swapData(Agenda4.listaContatos4)
    }
}