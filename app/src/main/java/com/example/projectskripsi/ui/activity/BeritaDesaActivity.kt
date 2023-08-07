package com.example.projectskripsi.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectskripsi.databinding.ActivityBeritaDesaBinding

class BeritaDesaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBeritaDesaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeritaDesaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarBeritaDesa.apply {
            setNavigationOnClickListener {
                onBackPressedDispatcher.onBackPressed()
            }
        }

        binding.layoutBeritaDesaHalamanBeritaDesa.btnBacSekarang1.setOnClickListener {
            startActivity(Intent(this, DetailBeritaDesaActivity::class.java))
        }
    }
}