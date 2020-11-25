package com.kradwan.customviewdsc

import android.view.TextureView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

object ViewBinder {

    //        ViewBinder.setCurrencyData(containerCurrency ,"ASC 12" ,"ASC 23" ,"ASc" ,32.3 , R.drawable.ic_currency_2)

    fun setCurrencyData(
        view: View,
        name: String,
        term: String,
        price: String,
        percentage: Double,
        image: Int
    ) {

        val tvName = view.findViewById<TextView>(R.id.tvName)
        val tvTerm = view.findViewById<TextView>(R.id.tvTerm)
        val tvPrice = view.findViewById<TextView>(R.id.tvPrice)
        val tvPercentage = view.findViewById<TextView>(R.id.tvPercentage)
        val imgCurrency = view.findViewById<ImageView>(R.id.imgCurrency)
        val imgStatus = view.findViewById<ImageView>(R.id.imgStatus)


        tvName.text = "${name}"
        tvTerm.text = "${term}"
        tvPrice.text = "${price}"
        tvPercentage.text = " ${percentage} %"
        imgCurrency.setImageDrawable(
            ContextCompat.getDrawable(view.context, image)
        )
        if (percentage > 0) {
            tvPercentage.setTextColor(ContextCompat.getColor(view.context, R.color.greenColor))
            imgStatus.setImageDrawable(
                ContextCompat.getDrawable(view.context, R.drawable.ic_top_arrow)
            )
        } else {
            tvPercentage.text = " ${percentage} %"
            tvPercentage.setTextColor(ContextCompat.getColor(view.context, R.color.redColor))
            imgStatus.setImageDrawable(
                ContextCompat.getDrawable(view.context, R.drawable.ic_bottom_arrow)
            )
        }

    }

}