package com.example.recyclerview_list.data

import com.example.recyclerview_list.R
import com.example.recyclerview_list.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.number1,R.string.affirmation1, R.drawable.sobin,R.string.masage1),
            Affirmation(R.string.number2,R.string.affirmation2, R.drawable.huongtram,R.string.masage2),
            Affirmation(R.string.number3,R.string.affirmation3, R.drawable.chidan,R.string.masage3),
            Affirmation(R.string.number4,R.string.affirmation4, R.drawable.baoanh,R.string.masage4)

        )
    }
}