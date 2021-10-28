package com.example.teste.MinhaAgendaV6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste.R
import com.example.teste.databinding.ActivityEditarContato6Binding

class EditarContato6Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEditarContato6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditarContato6Binding.inflate(layoutInflater)


        setTitle("Editar Contato")


        val indiceContato6 = intent.getIntExtra("indiceContato", -1)

        val nome: String = Agenda6.listaContatos6[indiceContato6].nome
        val Sobrenome: String = Agenda6.listaContatos6[indiceContato6].sobrenome
        val telefone: String = Agenda6.listaContatos6[indiceContato6].telefone
        val email: String = Agenda6.listaContatos6[indiceContato6].email
        val endereço: String = Agenda6.listaContatos6[indiceContato6].endereço

        binding.agenda6TxtNome.setText(nome)
        binding.agenda6TxtSobreNome.setText(Sobrenome)
        binding.agenda6TxtTelefone.setText(telefone)
        binding.agenda6Txtemail.setText(email)
        binding.agenda6TxtEndereO.setText(endereço)

        binding.agenda6BtSalvar.setOnClickListener {
            Agenda6.listaContatos6[indiceContato6].nome = binding.agenda6TxtNome.text.toString()
            Agenda6.listaContatos6[indiceContato6].sobrenome = binding.agenda6TxtSobreNome.text.toString()
            Agenda6.listaContatos6[indiceContato6].telefone = binding.agenda6TxtTelefone.text.toString()
            Agenda6.listaContatos6[indiceContato6].email = binding.agenda6Txtemail.text.toString()
            Agenda6.listaContatos6[indiceContato6].endereço = binding.agenda6TxtEndereO.text.toString()
            Toast.makeText(this, "Contato Salvo", Toast.LENGTH_SHORT).show()
            finish()
        }
        setContentView(binding.root)
    }
}