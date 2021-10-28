
package com.example.teste.pessoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste.databinding.ActivityPessoasBinding

class PessoasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPessoasBinding

    private var nome = ""
    private  var idade = 0

    private val listaPessoas = mutableListOf<Pessoa>()
    private  var indiceAtual = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPessoasBinding.inflate(layoutInflater)

        binding.btImprimir.setOnClickListener{
            binding.txtSaidaaa.text = imprimePessoa()
        }
        binding.btSalvarr.setOnClickListener {
            nome = binding.txtNome.text.toString()
            binding.txtNome.text.clear()
            idade = binding.txtIdade.text.toString().toInt()
            binding.txtIdade.text.clear()

            val pessoa = Pessoa(nome, idade)
            listaPessoas.add(pessoa)

        }
            setContentView(binding.root)
        }


    fun imprimePessoa(): String{
        if (indiceAtual >= listaPessoas.size)
            indiceAtual = 0
        val pessoaAtual = listaPessoas[indiceAtual]
        indiceAtual++
        return "Nome: ${pessoaAtual.nome}, Idade: ${pessoaAtual.idade}"
    }


class Pessoa(val nome: String, val idade: Int)
}