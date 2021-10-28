package com.example.teste.MinhaAgendaV6.fragments6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teste.databinding.FragmentAjustes6Binding
import com.example.teste.databinding.FragmentAjustesBinding

class AjusteFragment6: Fragment() {
    private var _binding: FragmentAjustes6Binding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAjustes6Binding.inflate(inflater, container, false)


        val config = requireActivity().getSharedPreferences("configuracoes", 0)

        binding.switch6.isChecked = config.getBoolean("listaContatosAlfabeticos", false)

        binding.switch6.setOnCheckedChangeListener{ compoundButton, b ->
            val editor = config.edit()
            editor.putBoolean("listaContatosAlfabeticos", compoundButton.isChecked)
            editor.apply()
        }
        return binding.root

    }
}