package com.example.teste.MinhaAgendaV6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teste.databinding.ItemContato6Binding

class ContatoAdapter6(
    val listaContato6: MutableList<Contato6>,
    val onBtEditarClick6: (Int)-> Unit
) : RecyclerView.Adapter<ContatoAdapter6.ViewHolder6>() {

    inner class ViewHolder6(val binding: ItemContato6Binding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder6 {
        return ViewHolder6(
            ItemContato6Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ))
        }

    override fun getItemCount(): Int {
        return listaContato6.size
        }

    override fun onBindViewHolder(holder: ViewHolder6, position: Int) {
        holder.binding.txtNome6.text = listaContato6[position].nome
//        holder.binding.txtTelefone6.text = listaContato6[position].telefone

        holder.binding.btEditarContato6.setOnClickListener {
            onBtEditarClick6(position)
        }
    }
        fun swapData(novaListaContatos6: List<Contato6>){
            listaContato6.clear()
            listaContato6.addAll(novaListaContatos6)
            notifyDataSetChanged()
        }
    }

