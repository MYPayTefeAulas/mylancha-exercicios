package com.example.teste.MinhaAgendaV5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste.R
import com.example.teste.databinding.ActivityEditarContato5Binding

class EditarContato5Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEditarContato5Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditarContato5Binding.inflate(layoutInflater)

        setTitle("Editar Contato")

        val indiceContatoo5 = intent.getIntExtra("indiceContato", -1)

        val nome: String = Agenda5.listaContato5[indiceContatoo5].nome
        val SobreNome: String = Agenda5.listaContato5[indiceContatoo5].SobreNome
        val telefone: String = Agenda5.listaContato5[indiceContatoo5].telefone
        val email: String = Agenda5.listaContato5[indiceContatoo5].email
        val endereço: String = Agenda5.listaContato5[indiceContatoo5].endereço
        binding.agenda5TxtTelefone.setText(telefone)
        binding.agenda5TxtSobreNome.setText(SobreNome)
        binding.agenda5TxtNome.setText(nome)
        binding.agenda5TxtEndereO.setText(endereço)
        binding.agenda5Txtemail.setText(email)

        binding.agenda5BtSalvar.setOnClickListener {
            Agenda5.listaContato5[indiceContatoo5].nome = binding.agenda5TxtNome.text.toString()
            Agenda5.listaContato5[indiceContatoo5].SobreNome = binding.agenda5TxtSobreNome.text.toString()
            Agenda5.listaContato5[indiceContatoo5].telefone = binding.agenda5TxtTelefone.text.toString()
            Agenda5.listaContato5[indiceContatoo5].email = binding.agenda5Txtemail.text.toString()
            Agenda5.listaContato5[indiceContatoo5].endereço = binding.agenda5TxtEndereO.text.toString()
            Toast.makeText(this, "Contato Salvo!", Toast.LENGTH_SHORT).show()
            finish()
        }


        setContentView(binding.root)
    }
}