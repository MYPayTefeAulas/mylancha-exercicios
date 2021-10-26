package com.example.teste.MinhaAgendaV3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teste.databinding.ItemContato2Binding

class ContatoAdapter(
    val listaContatos3 : MutableList<Contato3>
    ): RecyclerView.Adapter<ContatoAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemContato2Binding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemContato2Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ))
    }

    override fun getItemCount(): Int {
        return listaContatos3.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtNome.text = listaContatos3[position].nome
        holder.binding.txtTelefone.text = listaContatos3[position].telefone
        holder.binding.txtEmail.text = listaContatos3[position].email
        }
    }
