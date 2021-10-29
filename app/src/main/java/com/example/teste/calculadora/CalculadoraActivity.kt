package com.example.teste.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste.databinding.ActivityCalculadoraBinding

class CalculadoraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculadoraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalculadoraBinding.inflate(layoutInflater)  //permite interagir com os elementos da tela

        binding.btTrocarText.setOnClickListener {
            trocaTextoInput()
            binding.txtHello.text = calculador()
        }

        val view = binding.root
        setContentView(view)    //monta a tela
    }

    fun calculaDobro(): String {
        val textoEntrada = binding.txtnumero1.text.toString()
        val nummero = textoEntrada.toInt()
        val dobro = nummero * 2
        return dobro.toString()
    }

    fun calculadora(): String {
        val textEntrada1 = binding.txtnumero1.text.toString()
        val textEntrada2 = binding.txtnumero2.text.toString()
        val num1 = textEntrada1.toInt()
        val num2 = textEntrada2.toInt()
        val resultado = num1 * num2
        return resultado.toString()
    }

    //fun trocarTexto(){
    //binding.txtHello.text = "MyLancha!


    fun trocarTexto(): String {
        return "MyLancha!"
    }

    fun trocarTexto2(): String {
        return binding.txtnumero1.text.toString()
    }

    fun trocaTextoInput() {
        binding.txtHello.text = binding.txtnumero2.text.toString()
    }

    fun calcular(): String {
        val operacao = binding.txtOperacao.text.toString()
        val numero1 = binding.txtnumero1.text.toString().toInt()
        val numero2 = binding.txtnumero2.text.toString().toInt()
        var resultado = ""
        if (operacao == "+") {
            resultado = (numero1 + numero2).toString()
            return resultado.toString()
        } else if (operacao == "-") {
            resultado = (numero1 - numero2).toString()
            return resultado.toString()
        } else if (operacao == "*") {
            resultado = (numero1 * numero2).toString()
            return resultado.toString()
        } else if (operacao == "/") {
            resultado = (numero1 / numero2).toString()
            return resultado.toString()
        } else {
            return "operação não efetuada"
        }


    }

    fun calculador(): String {
        val operacao = binding.txtOperacao.text.toString()
        val num1 = binding.txtnumero1.text.toString().toInt()
        val num2 = binding.txtnumero2.text.toString().toInt()
        var resultado = ""

        when (operacao) {
            "+"-> resultado = (num1+num2).toString()
            "-"-> resultado = (num1-num2).toString()
            "*"-> resultado = (num1*num2).toString()
            "/"-> resultado = (num1/num2).toString()
            else -> resultado = "Operação não aceita"
        }
        return resultado.toString()
    }
}