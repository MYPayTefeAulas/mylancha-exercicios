package com.example.teste.MinhaAgendaV6.fragments6

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teste.MinhaAgendaV6.Agenda6
import com.example.teste.MinhaAgendaV6.ContatoAdapter6
import com.example.teste.MinhaAgendaV6.EditarContato6Activity
import com.example.teste.R
import com.example.teste.databinding.FragmentListaContatos6Binding

class ListaContatos6MelhoradaFragment: Fragment(), SearchView.OnQueryTextListener {
    private var _binding: FragmentListaContatos6Binding? = null


    private val binding get() = _binding!!

    private lateinit var adapter: ContatoAdapter6

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListaContatos6Binding.inflate(inflater, container, false)

        adapter = ContatoAdapter6(mutableListOf(), ::onBtEditarClick6)

        binding.rvContatos6.layoutManager = LinearLayoutManager(context)
        binding.rvContatos6.adapter = adapter
        binding.rvContatos6.addItemDecoration(
            DividerItemDecoration(
                context,
                LinearLayoutManager.VERTICAL
            ))
        carregaLista6()

        initTopBar()

        return binding.root
    }

    private fun carregaLista6(){
        val config = requireActivity().getSharedPreferences("configuracoes", 0)
        val listaOrdemAfabetica = config.getBoolean("listaContatosAlfabeticos", false)
        if (listaOrdemAfabetica){
            val listaOrdenada = Agenda6.listaContatos6.sortedBy { it.nome }
            adapter.swapData(listaOrdenada)
        }else{
            adapter.swapData(Agenda6.listaContatos6)

        }
    }
    private fun initTopBar() {
        binding.toolbarContatos6.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.search_top_bar -> {
                    val searchView = menuItem?.actionView as SearchView
                    searchView.queryHint = "Digite para pesquisar"
                    searchView.setOnQueryTextListener(this)
                    true
                }
                else -> false
            }
        }
    }


    override fun onQueryTextChange(newText: String?): Boolean =
        onQueryTextSubmit(newText)

    override fun onQueryTextSubmit(query: String?): Boolean {
        val queryLowerCase = query.toString().lowercase()

        val listaFiltrada = Agenda6.listaContatos6.filter { contatoAtual6 ->
            contatoAtual6.nome.lowercase().contains(queryLowerCase) ||
                    contatoAtual6.telefone.lowercase().contains(queryLowerCase)
        }
        adapter.swapData(listaFiltrada)
        return true
    }

    override fun onResume() {
        super.onResume()
        carregaLista6()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
    fun onBtEditarClick6(indiceLista: Int){
        val intent = Intent(context, EditarContato6Activity::class.java)
        intent.putExtra("indiceContato", indiceLista)
        startActivity(intent)

    }
}