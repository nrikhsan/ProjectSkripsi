package com.example.projectskripsi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectskripsi.databinding.ActivityDetailGaleriKegiatanBinding

class DetailGaleriKegiatanActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailGaleriKegiatanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailGaleriKegiatanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarDetailGaleriKegiatan.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}