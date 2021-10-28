package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste.MinhaAgendaV1.TelaInicialActivity
import com.example.teste.MinhaAgendaV2.TelaInicial2Activity
import com.example.teste.MinhaAgendaV3.TelaInicial3Activity
import com.example.teste.MinhaAgendaV4.TelaInicial4Activity
import com.example.teste.MinhaAgendaV5.TelaInicial5Activity
import com.example.teste.MinhaAgendaV6.TelaInicial6Activity
import com.example.teste.databinding.ActivityAgendaPrincipalBinding

class AgendaPrincipalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgendaPrincipalBinding.inflate(layoutInflater)

        binding.btAgebdaVersO1.setOnClickListener {
            val intent = android.content.Intent(this, TelaInicialActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Bem Vindo, Agenda V1", Toast.LENGTH_SHORT).show()
        }
        binding.btAgebdaVersO2.setOnClickListener {
            val intent = android.content.Intent(this, TelaInicial2Activity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Bem Vindo, Agenda V2", Toast.LENGTH_SHORT).show()
        }
        binding.btAgebdaVersO3.setOnClickListener {
            val intent = android.content.Intent(this, TelaInicial3Activity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Bem Vindo, Agenda V3", Toast.LENGTH_SHORT).show()
        }
        binding.btAgendaVers04.setOnClickListener {
            val intent = android.content.Intent(this, TelaInicial4Activity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Bem Vindo, Agenda V4", Toast.LENGTH_SHORT).show()
        }
        binding.btAgendaVers05.setOnClickListener {
            val intent = android.content.Intent(this, TelaInicial5Activity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Bem Vindo, Agenda V5", Toast.LENGTH_SHORT).show()
        }
        binding.btAgendaVers06.setOnClickListener {
            val intent = android.content.Intent(this, TelaInicial6Activity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Bem Vindo, Agenda V6", Toast.LENGTH_SHORT).show()
        }

        setTitle("Agenda Principal")



        setContentView(binding.root)
    }
}