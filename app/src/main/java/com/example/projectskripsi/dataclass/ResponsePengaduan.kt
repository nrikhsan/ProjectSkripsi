package com.example.projectskripsi.dataclass

data class ResponsePengaduan(
    var pengaduId : String? = null,
    var nik : String? = null,
    var catatan : String? = null,
    var konfirmasi : Boolean = false,
    var tanggal : String? = null
)
