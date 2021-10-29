package com.example.teste.sorteioDeDados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste.databinding.ActivitySorteioDeDadosBinding

class SorteioDeDadosActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySorteioDeDadosBinding
    private val listaDeDados = mutableListOf<Dados>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySorteioDeDadosBinding.inflate(layoutInflater)
        listaDeDados.add(Dados(4))
        listaDeDados.add(Dados(6))
        listaDeDados.add(Dados(8))

        binding.btTrocaDado1.setOnClickListener{
            listaDeDados[0].lados = trocarDados(listaDeDados[0].lados)
            binding.txtDado1.text = "${listaDeDados[0].lados} lados"
        }

        binding.btTrocaDado2.setOnClickListener{
            listaDeDados[1].lados = trocarDados(listaDeDados[1].lados)
            binding.txtDado2.text = "${listaDeDados[1].lados} lados"
        }

        binding.btTrocaDado3.setOnClickListener{
            listaDeDados[2].lados = trocarDados(listaDeDados[2].lados)
            binding.txtDado3.text = "${listaDeDados[2].lados} lados"
        }
        binding.btSortearDados.setOnClickListener{
            binding.txtSaida1.text = listaDeDados[0].rolar().toString()
            binding.txtSaida2.text = listaDeDados[1].rolar().toString()
            binding.txtSaida3.text = listaDeDados[2].rolar().toString()
        }

        setContentView(binding.root)
    }
    fun trocarDados(lado: Int): Int{
        if (lado in 4..8){
            return (lado + 2)
        }else{
            return 4
        }
    }
}