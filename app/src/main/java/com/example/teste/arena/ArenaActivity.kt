package com.example.teste.arena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste.databinding.ActivityArenaBinding

class ArenaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArenaBinding
    //private var guerreiro: Guerreiro()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArenaBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
    fun jogarProximoTurno(){

    }
    fun obterTextoExibição(){

    }
}

