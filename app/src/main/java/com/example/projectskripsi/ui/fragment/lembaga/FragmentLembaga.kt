package com.example.projectskripsi.ui.fragment.lembaga

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.projectskripsi.databinding.FragmentLembagaBinding
import com.example.projectskripsi.ui.activity.DetailLembagaActivity

class FragmentLembaga : Fragment() {

    private var _binding: FragmentLembagaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLembagaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        binding.layoutLembagaDesa.btnBPD.setOnClickListener {
            startActivity(Intent(context, DetailLembagaActivity::class.java))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}