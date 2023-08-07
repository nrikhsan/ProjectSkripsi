package com.example.projectskripsi.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectskripsi.R
import com.example.projectskripsi.databinding.ActivityDetailBeritaDesaBinding

class DetailBeritaDesaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailBeritaDesaBinding

    companion object{
        const val URL_BERITA = "https://desa-cibentang.kuningankab.go.id/berita/bimbingan-teknis-pelatihan-website-desa"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBeritaDesaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.toolbarDetailberitaDesa.apply {
            setNavigationOnClickListener {
                onBackPressedDispatcher.onBackPressed()
            }

            setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.menu_bagikan_berita -> {
                        Intent(Intent.ACTION_SEND).also { intent ->
                            intent.type = "text/plain"
                            intent.putExtra(Intent.EXTRA_TEXT, URL_BERITA)
                            startActivity(Intent.createChooser(intent, "Bagikan dengan"))
                        }
                    }
                }
                return@setOnMenuItemClickListener true
            }
        }
    }
}