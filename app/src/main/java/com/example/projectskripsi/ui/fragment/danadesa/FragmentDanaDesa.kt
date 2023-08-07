package com.example.projectskripsi.ui.fragment.danadesa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.projectskripsi.databinding.FragmentDanaDesaBinding

class FragmentDanaDesa : Fragment() {

    private var _binding: FragmentDanaDesaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDanaDesaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.layoutTabelAnggaranDesa3.btnPDFAnggaranDesa.setOnClickListener {
            Intent(Intent.ACTION_VIEW).also {
                it.data = Uri.parse(PDF)
                startActivity(it)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        const val PDF = "https://drive.google.com/file/d/12WnWkyLUK5vjcZeoNYv7rfUaLwtAgFN0/view?usp=sharing"
    }
}