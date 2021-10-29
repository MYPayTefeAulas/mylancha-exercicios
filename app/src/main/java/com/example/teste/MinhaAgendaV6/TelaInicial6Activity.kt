package com.example.teste.MinhaAgendaV6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.teste.MinhaAgendaV6.fragments6.AjusteFragment6
import com.example.teste.MinhaAgendaV6.fragments6.ListaContatos6Fragment
import com.example.teste.MinhaAgendaV6.fragments6.ListaContatos6MelhoradaFragment
import com.example.teste.R
import com.example.teste.databinding.ActivityTelaInicial6Binding
import com.example.teste.databinding.FragmentListaContatos6Binding

class TelaInicial6Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTelaInicial6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaInicial6Binding.inflate(layoutInflater)


        inicializaLista6()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer6, ListaContatos6Fragment())
            .commit()

        binding.bottomNavigation6.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> {
                    loadFragments(ListaContatos6MelhoradaFragment(), FRAGMENT_HOME )
                true
                }
                R.id.ic_ajustes -> {
                    loadFragments(AjusteFragment6(), FRAGMENT_AJUSTES)
                    true
                }
                else ->
                    false
            }
        }

        setContentView(binding.root)
    }

    private fun loadFragments(fragment6: Fragment, tag: String) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer6, fragment6, tag)
            commit()
        }

    }
    private fun inicializaLista6(){
        Agenda6.listaContatos6.addAll(
            listOf(
                Contato6("Genival", "Lima", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Luis Felipe", "INÁCIO", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Israel", "da Silva", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Vanessa", "Sobral", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("José", "Augusto", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Pedro", "Henrique", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("William", "Miguel", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Robert", "Luis", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Varlei", "Barbosa", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Sabrina", "de Souza", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Jéssica", "Rodrigues", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Ivan", "Carvalho", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Mario", "Mascarenhas", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("MARIA", "CAROLINE", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("RONEY", "JUNIOR", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Milena", "Dias", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Ecson", "Gama", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Maria", "Garcia", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("RAIANE", "FERREIRA", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("JAQUELINE", "LIMA", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Larissa", "Da Silva", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Erigeyce", "Gama", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Rodrigo", "Bernardino", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Narla", "Chagas", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Luiz Felipe", "de SOUZA", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Keitiane", "Nogueira", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Thalia", "Souza", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("José ", "Santos", "01", "@mypayUea.com.br", "Tefé-Am"),
                Contato6("Alex", "Pinto", "01", "@mypayUea.com.br", "Tefé-Am")
            )
        )

    }
    companion object{
        private const val FRAGMENT_HOME = "FRAGMENT_HOME"
        private const val FRAGMENT_AJUSTES = "FRAGMENT_AJUSTES"
    }

}

