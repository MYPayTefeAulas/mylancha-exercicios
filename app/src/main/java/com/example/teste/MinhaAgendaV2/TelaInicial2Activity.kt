package com.example.teste.MinhaAgendaV2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.teste.databinding.ActivityTelaInicial2Binding

class TelaInicial2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaInicial2Binding

    private lateinit var adapter: ArrayAdapter<Contato2>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaInicial2Binding.inflate(layoutInflater)

        setTitle("Agenda 02")

        Agenda2.listaContato2.add(Contato2("1 luis", "111", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("2 luis", "222", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("3 felipe", "333", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("4 felipe", "444", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("5 conceição", "555", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("6 conceição", "666", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("7 inacio", "777", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("8 inacio", "888", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("9 inacio", "999", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("10 luis", "1000", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("11 luis", "1414", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("11 luis", "1414", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("11 luis", "1414", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("11 luis", "1414", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("11 luis", "1414", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("11 luis", "1414", "luis@mypay.com"))
        Agenda2.listaContato2.add(Contato2("11 luis", "1414", "luis@mypay.com"))


        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Agenda2.listaContato2)
        binding.lvContatos2.adapter = adapter
        binding.lvContatos2.setOnItemClickListener { parent, view, position, id ->
            val contato = adapter.getItem(position)
            Toast.makeText(this, "${contato !!.nome}", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, EditarContato2Activity::class.java)
            intent.putExtra("indiceContato", position)
            startActivity(intent)
        }
        setContentView(binding.root)
    }

    override fun onResume() {
       super.onResume()
      adapter.notifyDataSetChanged()
    }
}

