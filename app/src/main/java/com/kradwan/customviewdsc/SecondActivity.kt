package com.kradwan.customviewdsc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.kradwan.customviewdsc.adapter.ExampleAdapter
import com.kradwan.customviewdsc.views.CurrencyModel
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.item_currency.*
import kotlinx.android.synthetic.main.item_currency.containerCurrency
import androidx.recyclerview.*;
import androidx.recyclerview.widget.LinearLayoutManager

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val model = CurrencyModel("ABC1 ", "CBA1", 100.0, 5.0, R.drawable.ic_currency_1)
        val model2 = CurrencyModel("ABC2 ", "CBA2", 100.0, 5.0, R.drawable.ic_currency_2)
        val model3 = CurrencyModel("ABC3 ", "CBA3", 100.0, 5.0, R.drawable.ic_currency_3)
        val model4 = CurrencyModel("ABC4 ", "CBA4", 100.0, 5.0, R.drawable.ic_currency_4)

        val models = arrayListOf<CurrencyModel>(model, model2, model3, model4)
        val adapter = ExampleAdapter(models)

        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)
//        cu2.setModel(model)

    }


}