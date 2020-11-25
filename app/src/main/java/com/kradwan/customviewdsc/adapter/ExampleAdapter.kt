package com.kradwan.customviewdsc.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kradwan.customviewdsc.views.CurrencyModel
import com.kradwan.customviewdsc.views.CurrencyView

class ExampleAdapter(val models: List<CurrencyModel>) :
    RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val view = CurrencyView(parent.context, null)
        return ExampleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        (holder.itemView as CurrencyView).setModel(models[position])
    }

    override fun getItemCount(): Int = models.size


    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {

        }

    }

}