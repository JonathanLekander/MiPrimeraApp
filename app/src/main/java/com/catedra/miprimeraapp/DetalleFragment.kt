package com.catedra.miprimeraapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.catedra.miprimeraapp.databinding.FragmentDetalleBinding

class DetalleFragment : Fragment() {

    private var _binding: FragmentDetalleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetalleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString(ARG_NAME) ?: "Visitante"
        binding.textHello.text = "Hello, $name!"

        binding.textInitial.text = name.firstOrNull()?.uppercase() ?: "?"

        binding.buttonBack.setOnClickListener {

            parentFragmentManager.popBackStack()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val ARG_NAME = "name"

        fun newInstance(name: String): DetalleFragment {
            return DetalleFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_NAME, name)
                }
            }
        }
    }
}