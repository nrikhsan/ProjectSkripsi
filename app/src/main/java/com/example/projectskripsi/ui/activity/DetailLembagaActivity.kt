package com.example.projectskripsi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectskripsi.databinding.ActivityDetailLembagaBinding

class DetailLembagaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailLembagaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailLembagaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarDetailLembaga.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}