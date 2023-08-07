package com.example.projectskripsi.ui.activity

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectskripsi.R
import com.example.projectskripsi.adapter.AdapterRiwayatPengaduan
import com.example.projectskripsi.databinding.ActivityRiwayatPengaduanBinding
import com.example.projectskripsi.databinding.LayoutBottomSheetRiwayatPengaduanBinding
import com.example.projectskripsi.dataclass.ResponsePengaduan
import com.example.projectskripsi.utils.EnumClass
import com.example.projectskripsi.utils.MyFirebaseMessagingService
import com.example.projectskripsi.utils.channelId
import com.example.projectskripsi.utils.channelName
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class RiwayatPengaduanActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRiwayatPengaduanBinding
    private lateinit var responsPengaduan : ArrayList<ResponsePengaduan>
    private lateinit var dataBase : DatabaseReference
    private lateinit var bottomSheetDialog: BottomSheetDialog
    private val myFirebaseMessagingService = MyFirebaseMessagingService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRiwayatPengaduanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataBase = FirebaseDatabase.getInstance().reference.child("pengaduan")

        binding.toolbarRiwayatPengaduan.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        responsPengaduan = arrayListOf()
        dataBase.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                responsPengaduan.clear()
                if (snapshot.exists()){
                    for (pengaduanSnapShot in snapshot.children){
                        val dataPengaduan = pengaduanSnapShot.getValue(ResponsePengaduan::class.java)
                        responsPengaduan.add(dataPengaduan!!)
//                        if (dataPengaduan.konfirmasi){
//                            val title = "Pengaduan"
//                            val message = "Pengaduan anda telah dikonfirmasi"
//                            tampilNotifikasiDariAdmin(title, message)
//                        }
                    }

                    val adapterRiwayatPengaduan = AdapterRiwayatPengaduan(responsPengaduan)
                    binding.rvRiwayatPengaduan.apply {
                        adapter = adapterRiwayatPengaduan
                        layoutManager = LinearLayoutManager(this@RiwayatPengaduanActivity)
                        visibility = View.VISIBLE
                        setHasFixedSize(true)
                    }

                    adapterRiwayatPengaduan.showDetailPengaduan(object : AdapterRiwayatPengaduan.showDetailPengaduan{
                        override fun itemClick(position: Int) {

                            val bottomSheetRiwayatPengaduanBinding = LayoutBottomSheetRiwayatPengaduanBinding.inflate(layoutInflater)
                            bottomSheetDialog = BottomSheetDialog(this@RiwayatPengaduanActivity)
                            bottomSheetDialog.setContentView(bottomSheetRiwayatPengaduanBinding.root)
                            bottomSheetDialog.show()

                            intent.putExtra("pengaduId", responsPengaduan[position].pengaduId)
                            intent.putExtra("nik", EnumClass.getNik(responsPengaduan[position].nik.toString()))
                            intent.putExtra("catatan", responsPengaduan[position].catatan)
                            intent.putExtra("konfirmasi", responsPengaduan[position].konfirmasi)
                            intent.putExtra("tanggal", responsPengaduan[position].tanggal)


                            bottomSheetRiwayatPengaduanBinding.apply {

                                tvNik.text = intent.getStringExtra("nik")
                                tvCatatan.text = intent.getStringExtra("catatan")
                                tvTanggalRiwayat.text = intent.getStringExtra("tanggal")



                                if (intent.getBooleanExtra("konfirmasi", true)){
                                    imageCheck.setImageDrawable(ContextCompat.getDrawable(this@RiwayatPengaduanActivity, R.drawable.check))
                                    imageCheck.visibility = View.VISIBLE
                                }else{
                                    imageCheck.visibility = View.GONE
                                }

                                btnTutup.setOnClickListener {
                                    bottomSheetDialog.dismiss()
                                }
                            }
                        }
                    })
                }else{
                    binding.rvRiwayatPengaduan.apply {
                        visibility = View.GONE
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@RiwayatPengaduanActivity, error.message, Toast.LENGTH_SHORT).show()
            }
        })
    }

    //notifikasi konfirmasi pengaduan
    private fun tampilNotifikasiDariAdmin(title: String, message: String) {

        myFirebaseMessagingService.getRemoteView(title, message)

        val intent = Intent(this, RiwayatPengaduanActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        val pendingIntent = PendingIntent.getActivity(
            this,
            0,
            intent,
            PendingIntent.FLAG_IMMUTABLE
        )
        //channel id, channel name
        var builder: NotificationCompat.Builder = NotificationCompat.Builder(applicationContext, channelId)
            .setSmallIcon(R.drawable.notifications)
            .setAutoCancel(true)
            .setVibrate(longArrayOf(1000, 1000, 1000, 1000))
            .setOnlyAlertOnce(true)
            .setContentIntent(pendingIntent)


        builder = builder.setContent(myFirebaseMessagingService.getRemoteView(title, message))

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notificationChannel = NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH)
        notificationManager.createNotificationChannel(notificationChannel)
        notificationManager.notify(0,builder.build())
    }
}