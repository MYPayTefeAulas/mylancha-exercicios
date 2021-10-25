package com.example.teste.MinhaAgendaV1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste.databinding.ActivityEditarContatoBinding

class EditarContatoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditarContatoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditarContatoBinding.inflate(layoutInflater)
         setTitle("Editar Contato")

         val indiceContato = intent.getIntExtra("indiceContato", -1)
        val nome: String = Agenda.listaContatoss[indiceContato].nome
        val telefone: String = Agenda.listaContatoss[indiceContato].telefone
        binding.agendaTxtTelefone.setText(telefone)
        binding.agendaTxtNome.setText(nome)

        binding.agendaBtSalvar.setOnClickListener {
            Agenda.listaContatoss[indiceContato].nome = binding.agendaTxtNome.text.toString()
            Agenda.listaContatoss[indiceContato].telefone = binding.agendaTxtTelefone.text.toString()

        Toast.makeText(this, "contato salvo com sucesso!", Toast.LENGTH_SHORT).show()
            finish()
        }



        setContentView(binding.root)
    }
}