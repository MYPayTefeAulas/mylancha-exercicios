package com.example.teste.frutas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste.databinding.ActivityListas2Binding

class ListasActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityListas2Binding

    private val listafrutas = listOf("maçã", "manga", "goiaba", "maracujá")
    private val listavegeteis = listOf("pepino", "alface", "pimentão")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListas2Binding.inflate(layoutInflater)

        binding.btImprimir.setOnClickListener {
            binding.txtSaidaaa.text = analisar(binding.txtEntrada.text.toString())
        }

        setContentView(binding.root)
    }

    fun analisar(entrada: String): String {
        var saida = ""
        for (fruta in listafrutas) {
            if (fruta == entrada) {
                saida = "é uma fruta"
                break
            }

        }

            for (vegetal in listavegeteis) {
                if (vegetal == entrada) {
                    saida = "é um vegetal"
                    break
                }

            }
            return saida
        }
    }




