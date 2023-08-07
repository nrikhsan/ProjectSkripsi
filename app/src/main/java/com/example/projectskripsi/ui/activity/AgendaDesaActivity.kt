package com.example.projectskripsi.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectskripsi.databinding.ActivityAgendaDesaBinding

class AgendaDesaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAgendaDesaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaDesaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarAgendaDesa.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.layoutAgendaDesa.cardAgendaPengobatan.setOnClickListener {
            startActivity(Intent(this, DetailAgendaDesaActivity::class.java))
        }
    }
}