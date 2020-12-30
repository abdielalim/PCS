package com.abdielalim.localpride.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    val nama : String = "",
    val kode : String = "",
    val deskripsi : String = "",
    val gambar : String = "",
) : Parcelable
