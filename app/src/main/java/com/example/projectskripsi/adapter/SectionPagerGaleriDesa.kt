package com.example.projectskripsi.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.projectskripsi.ui.fragment.foto.FragmentFoto
import com.example.projectskripsi.ui.fragment.video.FragmentVideo

class SectionPagerGaleriDesa internal constructor(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when(position){
            0-> fragment = FragmentFoto()
            1-> fragment = FragmentVideo()
        }
        return fragment
    }
}