package com.example.projectskripsi.ui.fragment.video

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projectskripsi.databinding.FragmentVideoBinding

class FragmentVideo : Fragment() {

    private var _binding : FragmentVideoBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val VIDEO_1 = "https://www.youtube.com/watch?v=pj1xEJ9D790&ab_channel=HAKLIKab.Kuningan"
        const val VIDEO_2 = "https://www.youtube.com/watch?v=SgMj2EeCcKU&ab_channel=Tvdeokbku"
        const val VIDEO_3 = "https://www.youtube.com/watch?v=8H-0cxU1on8&ab_channel=Tvdeokbku"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentVideoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            layoutVideoKegiatan.video1.setOnClickListener {
                Intent(Intent.ACTION_VIEW).also { yt->
                    yt.data = Uri.parse(VIDEO_1)
                    yt.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    startActivity(yt)
                }
            }

            layoutVideoKegiatan.video2.setOnClickListener {
                Intent(Intent.ACTION_VIEW).also { yt->
                    yt.data = Uri.parse(VIDEO_2)
                    yt.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    startActivity(yt)
                }
            }

            layoutVideoKegiatan.video3.setOnClickListener {
                Intent(Intent.ACTION_VIEW).also { yt->
                    yt.data = Uri.parse(VIDEO_3)
                    yt.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    startActivity(yt)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}