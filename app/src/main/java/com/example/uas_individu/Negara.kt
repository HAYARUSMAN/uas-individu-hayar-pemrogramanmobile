package com.example.uas_individu

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Negara(
    val imgView: Int,
    val txtTitle: String,
    val txtSub:String,
    val music: Int
) : Parcelable