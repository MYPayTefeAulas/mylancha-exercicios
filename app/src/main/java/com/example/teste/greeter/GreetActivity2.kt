package com.example.teste.greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste.greeter2.Pessoa
import com.example.teste.databinding.ActivityGreet2Binding

class GreetActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityGreet2Binding
    private val listaNomes = mutableListOf<String>()
    private var indiceAtual = 0
    private  lateinit var greeterAtual : GreeterTipo1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreet2Binding.inflate(layoutInflater)

        val greeter1 = GreeterTipo1("Olá", "!")
        val greeter2 = GreeterTipo1("Bem Vindo", "!!")
        val greeter3 = GreeterTipo1("iai", "!!!")

        greeterAtual = greeter1
        listaNomes.add("Luis")
        listaNomes.add("Felipe")
        listaNomes.add("Conceição")
        listaNomes.add("Inácio")



        binding.btImprimir.setOnClickListener{
            val nomeAtual = listaNomes[indiceAtual]

            binding.txtsSaida.text = greeterAtual.greet(nomeAtual)

            if (indiceAtual == listaNomes.size - 1){
                indiceAtual = 0
            }else if (indiceAtual == listaNomes.size - 1){
                indiceAtual = 2
            }

            else{
                indiceAtual ++
            }
        }

        binding.btTrocar.setOnClickListener{

            if (greeterAtual == greeter1){
                greeterAtual = greeter2
                binding.txtNumGreeter.text = "2"

            }else if (greeterAtual == greeter2){
                greeterAtual = greeter3

                binding.txtNumGreeter.text = "3"
            } else{
                greeterAtual = greeter1
                binding.txtNumGreeter.text = "1"

            }
        }
        setContentView(binding.root)
    }
}