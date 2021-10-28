package com.example.teste.MinhaAgendaV5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teste.R
import com.example.teste.databinding.ItemContato5Binding

class ContatoAdapter5(
    val listaContatos5: MutableList<Contato5>,
    val onBtEditarClick5: (Int) -> Unit
): RecyclerView.Adapter<ContatoAdapter5.ViewHolder>() {

    inner class ViewHolder(val binding: ItemContato5Binding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemContato5Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listaContatos5.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtNome5.text = listaContatos5[position].nome
        holder.binding.txtTelefone5.text = listaContatos5[position].telefone

        holder.binding.btEditarContato5.setOnClickListener {
            onBtEditarClick5(position)
        }
    }

    fun swpData(novaListaContatos5: List<Contato5>){
        listaContatos5.clear()
        listaContatos5.addAll(novaListaContatos5)
        notifyDataSetChanged()

    }
}