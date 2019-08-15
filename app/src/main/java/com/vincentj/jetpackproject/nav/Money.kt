package com.vincentj.jetpackproject.nav

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Keep
@Parcelize
data class Money(val amount: BigDecimal) : Parcelable