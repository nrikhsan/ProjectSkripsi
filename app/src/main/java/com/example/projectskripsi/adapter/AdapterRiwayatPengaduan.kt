package com.example.projectskripsi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.projectskripsi.R
import com.example.projectskripsi.databinding.CardRiwayatPengaduanBinding
import com.example.projectskripsi.dataclass.ResponsePengaduan
import com.example.projectskripsi.utils.EnumClass

class AdapterRiwayatPengaduan(private val pengaduan: ArrayList<ResponsePengaduan>) :
    RecyclerView.Adapter<AdapterRiwayatPengaduan.ViewHolder>() {

    private lateinit var onClick: showDetailPengaduan

    fun showDetailPengaduan(onClick: showDetailPengaduan) {
        this.onClick = onClick
    }

    interface showDetailPengaduan {
        fun itemClick(position: Int)
    }

    inner class ViewHolder(private val binding: CardRiwayatPengaduanBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(result: ResponsePengaduan) {

            binding.apply {

                tvNik.text = EnumClass.getNik(result.nik.toString())
                tvCatatan.text = result.catatan
                tvTanggalRiwayat.text = result.tanggal

                val konfirmasi = result.konfirmasi
                if (konfirmasi) {
                    imageCheck.apply {
                        setImageDrawable(ContextCompat.getDrawable(itemView.context, R.drawable.check))
                        visibility = View.VISIBLE
                    }
                } else {
                    imageCheck.visibility = View.GONE
                }
            }

            itemView.setOnClickListener {
                onClick.itemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CardRiwayatPengaduanBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = pengaduan.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val result = pengaduan[position]
        holder.bind(result)
    }
}