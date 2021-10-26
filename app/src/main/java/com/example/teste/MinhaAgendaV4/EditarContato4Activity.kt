package com.example.teste.MinhaAgendaV4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste.databinding.ActivityEditarContato4Binding

class EditarContato4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEditarContato4Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditarContato4Binding.inflate(layoutInflater)

        setTitle("Editar Contato")

        val indiceContato4 = intent.getIntExtra("indiceContato", -1)

        val nome: String = Agenda4.listaContatos4[indiceContato4].nome
        val sobreNome = Agenda4.listaContatos4[indiceContato4].sobreNome
        val telefone: String = Agenda4.listaContatos4[indiceContato4].telefone
        val email: String = Agenda4.listaContatos4[indiceContato4].email
        val endereço: String = Agenda4.listaContatos4[indiceContato4].Endereço
        binding.agenda4TxtTelefone.setText(telefone)
        binding.agenda4TxtNome.setText(nome)
        binding.agenda4TxtSobreNome.setText(sobreNome)
        binding.agenda4Txtemail.setText(email)
        binding.agenda4TxtEndereO.setText(endereço)

        binding.agenda4BtSalvar.setOnClickListener{
            Agenda4.listaContatos4[indiceContato4].nome = binding.agenda4TxtNome.text.toString()
            Agenda4.listaContatos4[indiceContato4].telefone = binding.agenda4TxtTelefone.text.toString()
            Agenda4.listaContatos4[indiceContato4].sobreNome = binding.agenda4TxtSobreNome.text.toString()
            Agenda4.listaContatos4[indiceContato4].email = binding.agenda4Txtemail.text.toString()
            Agenda4.listaContatos4[indiceContato4].Endereço = binding.agenda4TxtEndereO.text.toString()
            Toast.makeText(this, "Contato Salvo!", Toast.LENGTH_SHORT).show()
            finish()
        }

        setContentView(binding.root)
    }
}