package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste.agenda_alura.Agenda_AluraActivity
import com.example.teste.arena.ArenaActivity
import com.example.teste.calculadora.CalculadoraActivity
import com.example.teste.databinding.ActivityTelaPrincipalBinding
import com.example.teste.frutas.ListasActivity2
import com.example.teste.greeter.GreetActivity2
import com.example.teste.greeter2.Greeter2Activity2
import com.example.teste.pessoa.PessoasActivity
import com.example.teste.sorteioDeDados.SorteioDeDadosActivity

class TelaPrincipalActivity : AppCompatActivity() {
        private lateinit var binding : ActivityTelaPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaPrincipalBinding.inflate(layoutInflater)

        binding.btAbrirExercicioLista.setOnClickListener{
            val intent = android.content.Intent(this, ListasActivity2::class.java)
            startActivity(intent)
        }
        binding.btAbrirExercCioCalculadora.setOnClickListener{
            val intent = android.content.Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)
        }
        binding.btAbrirExercCioPessoa.setOnClickListener{
            val intent = android.content.Intent(this, PessoasActivity::class.java)
            startActivity(intent)
        }
        binding.btAbrirExercCioGreeter1.setOnClickListener{
            val intent = android.content.Intent(this, GreetActivity2::class.java)
            startActivity(intent)
        }
        binding.btAbrirExercCioGreeter2.setOnClickListener{
            val intent = android.content.Intent(this, Greeter2Activity2::class.java)
            startActivity(intent)
        }
        binding.btExercicoDados.setOnClickListener{
            val intent = android.content.Intent(this, SorteioDeDadosActivity::class.java)
            startActivity(intent)
        }
        binding.btAgenda.setOnClickListener {
            val intent = android.content.Intent(this, Agenda_AluraActivity::class.java)
            startActivity(intent)
        }
        binding.btBatalhaRPG.setOnClickListener {
            val intent = android.content.Intent(this, ArenaActivity::class.java)
            startActivity(intent)
        }


        setContentView(binding.root)
    }
}