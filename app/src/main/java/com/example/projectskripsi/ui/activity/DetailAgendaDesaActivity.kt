package com.example.projectskripsi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectskripsi.databinding.ActivityDetailAgendaDesaBinding

class DetailAgendaDesaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailAgendaDesaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailAgendaDesaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarDetailAgenda.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}