package com.example.projectskripsi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectskripsi.adapter.SectionPagerGaleriDesa
import com.example.projectskripsi.databinding.ActivityGaleriDesaBinding
import com.google.android.material.tabs.TabLayoutMediator

class GaleriDesaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGaleriDesaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGaleriDesaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarGaleriDesa.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val sectionPager = SectionPagerGaleriDesa(this)
        binding.apply {
            viewPagerGaleriDesa.adapter = sectionPager
            TabLayoutMediator(tabLayoutGaleriDesa, viewPagerGaleriDesa){ tab, position->
                when(position){
                    0-> tab.text = "Photo kegiatan"
                    1-> tab.text = "Video kegiatan"
                }
            }.attach()
        }
    }
}