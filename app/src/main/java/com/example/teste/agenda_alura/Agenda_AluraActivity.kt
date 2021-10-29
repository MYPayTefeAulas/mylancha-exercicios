package com.example.teste.agenda_alura

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste.arena.Pesssoa
import com.example.teste.databinding.ActivityAgendaAluraBinding

class Agenda_AluraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgendaAluraBinding
    private val listaContatos = mutableListOf<Contato>()
    private var indiceAtual = 0
    private var editarContato: Boolean = false
    private val agenda = Contato("nome", "telefone")
     private var contatoAtual = Pesssoa("", "")


    //private var contato = Contato()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgendaAluraBinding.inflate(layoutInflater)

        setTitle("AGENDA")


        binding.btSalvarr.setOnClickListener {
            //binding.btSalvarr.setTextColor(Color.rgb(201, 111, 123))
            var nome = binding.txtNomeContato.text.toString()
            //binding.txtNomeContato.text.clear()
            var telefone = binding.txtTelefone.text.toString()
            //binding.txtTelefone.text.clear()


            if (binding.txtNomeContato.text.toString() == "") {
                binding.txtSaidaaa.text = "Erro, campo vazio: Nome"
                binding.txtSaidaaa.setTextColor(Color.rgb(200, 100, 110))


            } else if (binding.txtTelefone.text.toString() == "") {
                binding.txtSaidaaa.text = "Erro, campo vazio: Telefone"
                binding.txtSaidaaa.setTextColor(Color.rgb(200, 100, 110))


            } else {
                nome = binding.txtNomeContato.text.toString()
                binding.txtNomeContato.text.clear()
                telefone = binding.txtTelefone.text.toString()
                binding.txtTelefone.text.clear()
                Toast.makeText(this, "contato salvo", Toast.LENGTH_SHORT).show()

                val contato = Contato(nome, telefone)
                listaContatos.add(contato)

                //binding.txtSaidaaa.text = "Contato Salvo"
                //binding.txtSaidaaa.setTextColor(Color.rgb(200, 100, 110))

                // listaContatos.add(Contato(nome, telefone))
            }


        }
        binding.btProximo.setOnClickListener {
            ProximoContato().toString()
        }

        binding.btDeletar.setOnClickListener {
             removeContato().toString()

        }

        setContentView(binding.root)
    }


    fun removeContato() {
        if (indiceAtual >= listaContatos.size - 1){
            indiceAtual = 0
           val contatoAtual = listaContatos[indiceAtual]
            listaContatos.remove(contatoAtual)

        } else {
            val contatoAtual = listaContatos[indiceAtual]
            listaContatos.remove(contatoAtual)
            Toast.makeText(this, "contato removido", Toast.LENGTH_SHORT).show()
        }
        //return " Seu contato, foi removido"


    }

    fun ProximoContato(){

        binding.txtSaidaaa.setTextColor(Color.rgb(200, 100, 110))

        val contatoAtual = listaContatos[indiceAtual]

        if (indiceAtual >= listaContatos.size - 1){
            indiceAtual = 0
        }else{
            indiceAtual++
        }
        Toast.makeText(this, "Nome: ${contatoAtual.nome}, Celular: ${contatoAtual.telefone}", Toast.LENGTH_SHORT).show()
        binding.txtNomeContato.setText(contatoAtual.nome)
        binding.txtTelefone.setText(contatoAtual.telefone)
       // return "Nome: ${contatoAtual.nome}, Celular: ${contatoAtual.telefone}"

    }

}





