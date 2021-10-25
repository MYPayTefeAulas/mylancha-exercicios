package com.example.teste.MinhaAgendaV4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teste.databinding.ItemContato4Binding

class ContatoAdapter4 (
    val listaContatos4: MutableList<Contato4>,
    val onBtEditarClick: (Int) -> Unit
        ): RecyclerView.Adapter<ContatoAdapter4.ViewHolder>() {

    inner class ViewHolder(val binding: ItemContato4Binding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemContato4Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ))

    }

    override fun getItemCount(): Int {
        return listaContatos4.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtNome4.text = listaContatos4[position].nome
        holder.binding.txtTelefone4.text = listaContatos4[position].telefone

        //holder.binding.root.setOnClickListener{
            //onItemClick(position)
       // }
        holder.binding.btEditarrContato4.setOnClickListener{
           onBtEditarClick(position)

        }
    }

    fun swapData(novaListaContatos: List<Contato4>) {
        listaContatos4.clear()
        listaContatos4.addAll(novaListaContatos)
        notifyDataSetChanged()

    }
}