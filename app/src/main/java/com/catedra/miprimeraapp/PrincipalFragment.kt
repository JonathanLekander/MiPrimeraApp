package com.catedra.miprimeraapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.catedra.miprimeraapp.databinding.FragmentPrincipalBinding

class PrincipalFragment : Fragment() {

    private var _binding: FragmentPrincipalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPrincipalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Usando tus IDs originales
        binding.buttonContinue.setOnClickListener {
            val name = binding.editTextName.text.toString()

            if (name.isBlank()) {
                binding.editTextName.error = "Ingresa tu nombre"
                return@setOnClickListener
            }

            val detalle = DetalleFragment.newInstance(name)

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, detalle)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}