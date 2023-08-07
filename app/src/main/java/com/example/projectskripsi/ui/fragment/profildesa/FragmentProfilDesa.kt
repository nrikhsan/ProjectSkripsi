package com.example.projectskripsi.ui.fragment.profildesa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.projectskripsi.databinding.FragmentProfilDesaBinding

class FragmentProfilDesa : Fragment() {

    private var _binding: FragmentProfilDesaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfilDesaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            btnMaps.setOnClickListener {
                Intent(Intent.ACTION_VIEW).also { intent ->
                    intent.data = Uri.parse(LINK_MAPS)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    startActivity(intent)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        const val LINK_MAPS = "https://www.google.com/maps/place/Cibentang,+Kec.+Kramatmulya,+Kabupaten+Kuningan,+Jawa+Barat/@-6.9403793,108.4732031,16z/data=!3m1!4b1!4m6!3m5!1s0x2e6f16fed461f501:0x479bce5ddcb277c2!8m2!3d-6.9398364!4d108.4802781!16s%2Fg%2F12353ncd?entry=ttu"
    }
}