package com.example.teste.greeter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste.databinding.ActivityGreeter22Binding

class Greeter2Activity2 : AppCompatActivity() {
    private lateinit var binding: ActivityGreeter22Binding

    //private var nome = ""
    //private var idade: Int = 0

    private val listaPessoas = mutableListOf<String>()
    private var indiceeAtual = 0
    private lateinit var greeterAtual: GreeterTipo2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreeter22Binding.inflate(layoutInflater)

        val greeter1 = GreeterTipo2("Olá", "Sua idade é:")
        val greeter2 = GreeterTipo2("Sejá Bem Vindo", "Vc tem anos")
        greeterAtual = greeter1
        listaPessoas.add(Pessoa("Luis", 22).toString())
        listaPessoas.add(Pessoa("Felipe", 23).toString())
        listaPessoas.add(Pessoa("Inácio", 22).toString())


        binding.txtSalvarr.setOnClickListener {
          val nome = binding.txtNome.text.toString()
         binding.txtNome.text.clear()
           val idade = binding.txtIdadeee.text.toString().toInt()
         binding.txtIdadeee.text.clear()


         val pessoa = Pessoa(nome, idade)
          listaPessoas.add(pessoa.toString())
        }


        binding.btImprimirProximoo.setOnClickListener {
            val Atual = listaPessoas[indiceeAtual]
            //binding.txtSaaida.text = greeterAtual.greett1(Atual)
            //binding.txtSaaida.text = greeterAtual.greett2(Atual)
            if (indiceeAtual == listaPessoas.size - 1) {
                indiceeAtual = 0
            } else {
                indiceeAtual++
            }

        }



        binding.btTrocaar.setOnClickListener {
            if (greeterAtual == greeter1) {
                greeterAtual = greeter2
                binding.txtNummeroGreeter.text = "1"
            } else {
                greeterAtual = greeter1
                binding.txtNummeroGreeter.text = "2"
            }
        }
        setContentView(binding.root)
    }

    fun imprimePessoa(): String {
        if (indiceeAtual >= listaPessoas.size)
            indiceeAtual = 0
        val pessoaAtual = listaPessoas[indiceeAtual]
        indiceeAtual++

        return "${greeterAtual}"
    }
}







