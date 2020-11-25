package com.kradwan.dsclibrary

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat



class CurrencyView(context: Context, val attrs: AttributeSet?) : FrameLayout(context, attrs) {


    private lateinit var containerView: ConstraintLayout
    private lateinit var tvName: TextView
    private lateinit var tvTerm: TextView
    private lateinit var tvPrice: TextView
    private lateinit var tvPercentage: TextView
    private lateinit var imgCurrency: ImageView
    private lateinit var imgStatus: ImageView


    init {

        initViews()
    }

    private fun initViews() {

        val view = View.inflate(context, R.layout.item_currency, this)
        containerView = view.findViewById(R.id.containerCurrency)
        tvName = view.findViewById(R.id.tvName)
        tvTerm = view.findViewById(R.id.tvTerm)
        tvPrice = view.findViewById(R.id.tvPrice)
        tvPercentage = view.findViewById(R.id.tvPercentage)
        imgCurrency = view.findViewById(R.id.imgCurrency)
        imgStatus = view.findViewById(R.id.imgStatus)


        // TODO Try to Access Attrs
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CurrencyView)

        val title = typedArray.getString(R.styleable.CurrencyView_title) ?: ""
        val subTitle = typedArray.getString(R.styleable.CurrencyView_subTitle) ?: ""
        val price = typedArray.getFloat(R.styleable.CurrencyView_price, 0f)
        val img = typedArray.getDrawable(R.styleable.CurrencyView_img) ?: ContextCompat.getDrawable(
            context,
            R.drawable.ic_top_arrow
        )

        setData(title, subTitle)
        imgCurrency.setImageDrawable(img)

    }


    public fun setModel(model: CurrencyModel) {
        setData(model.title, model.subTitle, model.img)

    }

    private fun setData(title: String, subTitle: String) {
        this.tvName.text = "${title}"
        this.tvTerm.text = "${subTitle}"
        val percentage = 4.5

        tvPrice.text = "1999 $"
        tvPercentage.text = "${percentage} %"

    }

    private fun setData(title: String, subTitle: String, img: Int) {
        this.tvName.text = "${title}"
        this.tvTerm.text = "${subTitle}"
        val percentage = 4.5

        tvPrice.text = "1999 $"
        tvPercentage.text = "${percentage} %"
        imgCurrency.setImageDrawable(
            ContextCompat.getDrawable(context, img)
        )

        if (percentage > 0) {
            tvPercentage.setTextColor(ContextCompat.getColor(context, R.color.greenColor))
            imgStatus.setImageDrawable(
                ContextCompat.getDrawable(context, R.drawable.ic_top_arrow)
            )
        } else {
            tvPercentage.setTextColor(ContextCompat.getColor(context, R.color.redColor))
            imgStatus.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_bottom_arrow
                )
            )
        }
    }

}