package com.example.projectskripsi.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.projectskripsi.R
import com.example.projectskripsi.databinding.ActivityPengaduanBinding
import com.example.projectskripsi.dataclass.ResponsePengaduan
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class PengaduanActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPengaduanBinding
    private lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengaduanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = FirebaseDatabase.getInstance().reference.child("pengaduan")

        binding.toolbarPengaduan.apply {
            setNavigationOnClickListener {
                onBackPressedDispatcher.onBackPressed()
            }
            setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.menu_riwayat_pengaduan ->{
                        startActivity(Intent(this@PengaduanActivity, RiwayatPengaduanActivity::class.java))
                    }
                }
                return@setOnMenuItemClickListener true
            }
        }
        binding.btnKirimPengaduan.setOnClickListener {
            kirimAduan()
        }
    }

    private fun kirimAduan() {
        val pengaduId = database.push().key!!
        val nik = binding.edtNIK.text.toString().trim()
        val tanggal = String()
        val konfirmasi = Boolean
        val catatan = binding.edtCatatan.text.toString().trim()

        if (nik.isEmpty() || catatan.isEmpty()){
            Toast.makeText(this, "Form tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show()
        }else{
            kirimKeDataBase(pengaduId, nik, catatan, konfirmasi.equals(false), tanggal)
            onBackPressedDispatcher.onBackPressed()
        }
    }

    private fun kirimKeDataBase(pengaduId : String, nik: String, catatan: String, konfirmasi : Boolean, tanggal : String) {
        val response = ResponsePengaduan(pengaduId, nik, catatan, konfirmasi, tanggal)
        database.child(pengaduId).setValue(response)
            .addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(this, "Pengaduan berhasil terkirim, silahkan tunggu konfirmasi dari kami", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, RiwayatPengaduanActivity::class.java))
                }
            }.addOnFailureListener {
                Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
            }
    }
}