package com.example.recyclerview_list.model
import androidx.recyclerview.widget.RecyclerView

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val NumberResourceId:Int,
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val MessageResourceId: Int
)