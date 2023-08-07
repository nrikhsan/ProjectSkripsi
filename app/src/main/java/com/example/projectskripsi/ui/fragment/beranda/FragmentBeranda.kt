package com.example.projectskripsi.ui.fragment.beranda

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.NotificationCompat
import androidx.core.content.getSystemService
import androidx.fragment.app.Fragment
import com.example.projectskripsi.R
import com.example.projectskripsi.databinding.FragmentBerandaBinding
import com.example.projectskripsi.ui.activity.AgendaDesaActivity
import com.example.projectskripsi.ui.activity.BeritaDesaActivity
import com.example.projectskripsi.ui.activity.DetailAgendaDesaActivity
import com.example.projectskripsi.ui.activity.DetailBeritaDesaActivity
import com.example.projectskripsi.ui.activity.GaleriDesaActivity
import com.example.projectskripsi.ui.activity.PencarianBeritaActivity
import com.example.projectskripsi.ui.activity.PengaduanActivity
import com.example.projectskripsi.ui.activity.RiwayatPengaduanActivity
import com.example.projectskripsi.utils.MyFirebaseMessagingService
import com.example.projectskripsi.utils.channelId
import com.example.projectskripsi.utils.channelName

class FragmentBeranda : Fragment() {

    private var _binding: FragmentBerandaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val myFirebaseMessagingService = MyFirebaseMessagingService()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBerandaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvBeritaSelengkapnya.setOnClickListener {
            startActivity(Intent(context, BeritaDesaActivity::class.java))
        }

        binding.tvAgendaSelengkapnya.setOnClickListener {
            startActivity(Intent(context, AgendaDesaActivity::class.java))
        }

        binding.layoutBeritaDesaBeranda.btnBacSekarang1.setOnClickListener {
            startActivity(Intent(context, DetailBeritaDesaActivity::class.java))
        }

        binding.layoutAgendaDesaBeranda.cardAgendaPengobatan.setOnClickListener {
            startActivity(Intent(context, DetailAgendaDesaActivity::class.java))
        }

        binding.layoutGaleriDesaBeranda.btnLihatGaleriDesa.setOnClickListener {
            startActivity(Intent(context, GaleriDesaActivity::class.java))
        }

        binding.toolbarBeranda.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.menu_pencarian_berita -> {
                    startActivity(Intent(context, PencarianBeritaActivity::class.java))
                }
                R.id.menu_pengaduan -> {
                    startActivity(Intent(context, PengaduanActivity::class.java))
                }
            }
            return@setOnMenuItemClickListener false
        }

        val title = "Pengaduan"
        val message = "Pengaduan anda telah dikonfirmasi"
        tampilNotifikasiDariAdmin(title, message)
    }

    //notifikasi konfirmasi pengaduan
    //notifikasi pengaduan desa
    private fun tampilNotifikasiDariAdmin(title: String, message: String) {

        myFirebaseMessagingService.getRemoteView(title, message)

        val intent = Intent(context, RiwayatPengaduanActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        val pendingIntent = PendingIntent.getActivity(context,
            0,
            intent,
            PendingIntent.FLAG_IMMUTABLE
        )

        //channel id, channel name
        var builder: NotificationCompat.Builder = NotificationCompat.Builder(requireActivity(), channelId)
            .setSmallIcon(R.drawable.notifications)
            .setAutoCancel(true)
            .setVibrate(longArrayOf(1000, 1000, 1000, 1000))
            .setOnlyAlertOnce(true)
            .setContentIntent(pendingIntent)


        builder = builder.setContent(myFirebaseMessagingService.getRemoteView(title, message))

        val notificationManager = requireActivity().getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notificationChannel = NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH)
        notificationManager.createNotificationChannel(notificationChannel)
        notificationManager.notify(0,builder.build())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}