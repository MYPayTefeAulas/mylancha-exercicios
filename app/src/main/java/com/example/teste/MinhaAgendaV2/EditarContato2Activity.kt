package com.example.teste.MinhaAgendaV2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste.databinding.ActivityEditarContato2Binding

class EditarContato2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEditarContato2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditarContato2Binding.inflate(layoutInflater)

        setTitle("Editar Contato")

        val indiceContato2 = intent.getIntExtra("indiceContato", -1)

        val nome: String = Agenda2.listaContato2[indiceContato2].nome
        val telefone : String = Agenda2.listaContato2[indiceContato2].telefone
        val email: String = Agenda2.listaContato2[indiceContato2].email
        binding.agenda2TxtNome.setText(nome)
        binding.agenda2TxtTelefone.setText(telefone)
        binding.agenda2TxtEmail.setText(email)


        binding.agenda2BtSalvar.setOnClickListener {
            Agenda2.listaContato2[indiceContato2].nome = binding.agenda2TxtNome.text.toString()
            Agenda2.listaContato2[indiceContato2].telefone = binding.agenda2TxtTelefone.text.toString()
            Agenda2.listaContato2[indiceContato2].email = binding.agenda2TxtEmail.text.toString()
            Toast.makeText(this, "Contato Salvo com sucasso!", Toast.LENGTH_SHORT).show()
            finish()
        }



        setContentView(binding.root)
    }
}