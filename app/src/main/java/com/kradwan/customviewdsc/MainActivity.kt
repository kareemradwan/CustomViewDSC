package com.kradwan.customviewdsc

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.kradwan.customviewdsc.views.CurrencyModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.item_currency.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Handle Item Layout

        nextActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        val model = CurrencyModel("AA32 ", "BBB", 100.0, 5.0, R.drawable.ic_currency_5)
//        curreny1.setModel(model)
//        curreny1.setData("TEST1" ,"Test2" , R.drawable.ic_currency_4)

    }

}