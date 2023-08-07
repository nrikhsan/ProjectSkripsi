package com.example.projectskripsi.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectskripsi.databinding.ActivityPencarianBeritaBinding

class PencarianBeritaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPencarianBeritaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPencarianBeritaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            searchBerita.apply {
                onActionViewExpanded()
            }

            toolbarPencarianBerita.setNavigationOnClickListener {
                onBackPressedDispatcher.onBackPressed()
            }

            layoutBeritaPencarian.btnBacSekarang.setOnClickListener {
                startActivity(Intent(this@PencarianBeritaActivity, DetailBeritaDesaActivity::class.java))
            }
        }
    }
}