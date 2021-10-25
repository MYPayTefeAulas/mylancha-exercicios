package com.example.teste.MinhaAgendaV1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste.AgendaPrincipalActivity
import com.example.teste.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : AppCompatActivity() {
    private lateinit var binding : ActivityTelaInicialBinding

    private var indiceAtual = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaInicialBinding.inflate(layoutInflater)


        Agenda.listaContatoss.add(Contatos("Luis", "01"))
        Agenda.listaContatoss.add(Contatos("Caio", "02"))
        Agenda.listaContatoss.add(Contatos("Larissa", "03"))
        Agenda.listaContatoss.add(Contatos("Ecson", "04"))
        Agenda.listaContatoss.add(Contatos("Erigeyce", "05"))

        binding.btEditarContato.setOnClickListener {
        val intent = Intent(this, EditarContatoActivity::class.java)
            if (Agenda.listaContatoss.size == 0){
                Toast.makeText(this, "Agenda vazia", Toast.LENGTH_SHORT).show()
            }else{
                intent.putExtra("indiceContato", indiceAtual)
                startActivity(intent)
            }

        }

        binding.agendaBtImprimirProx.setOnClickListener {
            if (Agenda.listaContatoss.size != 0){
                indiceAtual = getProximoIndice()
                atualizaContatoExibido()
            }else{
                setAviso("Agenda vazia", COR_LARANJA)
            }

        }
        setTitle("Agenda 01")

        binding.btRetornar.setOnClickListener {
            val intent = Intent(this, AgendaPrincipalActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        atualizaContatoExibido()
    }

    fun atualizaContatoExibido(){
        if (Agenda.listaContatoss.size !=0){
            val contatoAtual = Agenda.listaContatoss[indiceAtual]
            val novoTexto = """
                nome: ${contatoAtual.nome}
                Telefone: ${contatoAtual.telefone}
            """.trimIndent()
            binding.agendaTxtMostrarContato.text = novoTexto
        }else{
            binding.agendaTxtMostrarContato.text = ""
        }

    }
    fun getProximoIndice(): Int{
        if(Agenda.listaContatoss.size == 0)
            throw error("Lista de constatos vazia! Use temContatos antes de chamar isso")
        if (indiceAtual + 1 == Agenda.listaContatoss.size)
        return 0
        else
            return indiceAtual + 1
    }
    fun setAviso(mensagem: String, cor: Int){
        binding.agendaTxtAvisos.text = mensagem
        binding.agendaTxtAvisos.setTextColor(cor)

    }
    companion object{
        val COR_LARANJA = Color.rgb(214, 127, 0)
    }





}