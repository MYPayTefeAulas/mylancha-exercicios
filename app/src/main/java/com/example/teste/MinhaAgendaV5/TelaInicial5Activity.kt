package com.example.teste.MinhaAgendaV5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.teste.MinhaAgendaV5.fragments.AjustesFragment
import com.example.teste.MinhaAgendaV5.fragments.ListaContatosFragment
import com.example.teste.R
import com.example.teste.databinding.ActivityTelaInicial5Binding

class TelaInicial5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaInicial5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaInicial5Binding.inflate(layoutInflater)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, ListaContatosFragment())
            .commit()

        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> {
                    loadFragments(ListaContatosFragment(), FRAGMENT_HOME)
                    true
                }
                R.id.ic_ajustes -> {
                    loadFragments(AjustesFragment(), FRAGMENT_AJUSTES)
                    true
                }
                else ->
                    false
            }
        }

        setContentView(binding.root)
    }
    private fun loadFragments(fragment: Fragment, tag: String){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment, tag)
            commit()
        }
    }
    companion object{
        private const val FRAGMENT_HOME = "FRAGMENT_HOME"
        private const val FRAGMENT_AJUSTES = "FRAGMENT_AJUSTES"
        private const val FRAGMENT_PERSON = "FRAGMENT_PERSON"
    }
}