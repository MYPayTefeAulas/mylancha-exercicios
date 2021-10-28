package com.example.teste.MinhaAgendaV5.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teste.MinhaAgendaV5.Agenda5
import com.example.teste.MinhaAgendaV5.Contato5
import com.example.teste.MinhaAgendaV5.ContatoAdapter5
import com.example.teste.MinhaAgendaV5.EditarContato5Activity
import com.example.teste.databinding.FragmentListaContatosBinding

class ListaContatosFragment: Fragment() {

    private var _binding : FragmentListaContatosBinding? = null

    private val binding get() = _binding!!

    private lateinit var adapter: ContatoAdapter5

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentListaContatosBinding.inflate(inflater, container, false)

        adapter = ContatoAdapter5(mutableListOf(), ::onBtEditarClick5)

        binding.rvContatos5.layoutManager = LinearLayoutManager(context)
        binding.rvContatos5.adapter = adapter
        binding.rvContatos5.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))

        inicializaLista5()
        adapter.swpData(Agenda5.listaContato5)

        return binding.root
}

    override fun onResume() {
        super.onResume()
        adapter.swpData(Agenda5.listaContato5)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun inicializaLista5(){
        Agenda5.listaContato5.addAll(
            listOf(
                Contato5("1 Luis", "01" ,"Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("2 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("3 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("4 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("5 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("6 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("7 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("8 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("9 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("10 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("11 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("12 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("13 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("14 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("15 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("16 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("17 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("18 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("19 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("20 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("21 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("22 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
                Contato5("23 Luis", "01","Inácio", "luis@mypay.com", "Tefé-Centro"),
            )
        )
    }

    fun onBtEditarClick5(indiceLista5: Int){
        val intent = Intent(context, EditarContato5Activity::class.java)
        intent.putExtra("indiceContato", indiceLista5)
        startActivity(intent)

    }
}
