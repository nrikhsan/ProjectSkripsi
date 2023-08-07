package com.example.projectskripsi.ui.fragment.foto

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projectskripsi.databinding.FragmentFotoBinding
import com.example.projectskripsi.ui.activity.DetailGaleriKegiatanActivity

class FragmentFoto : Fragment() {

    private var _binding : FragmentFotoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFotoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.layoutPerbaikanJalan.imagePerbaikanjalan.setOnClickListener {
            startActivity(Intent(context, DetailGaleriKegiatanActivity::class.java))
        }
        binding.layoutKerjaBakti.imageKerjabakti.setOnClickListener {
            startActivity(Intent(context, DetailGaleriKegiatanActivity::class.java))
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}