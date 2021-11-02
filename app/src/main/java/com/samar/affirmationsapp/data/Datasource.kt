package com.samar.affirmationsapp.data

import com.samar.affirmationsapp.R
import com.samar.affirmationsapp.model.affirmation

class Datasource {
    fun loadAffirmations(): List<affirmation> {
        return listOf<affirmation>(
            affirmation(R.string.affirmation1),
            affirmation(R.string.affirmation2),
            affirmation(R.string.affirmation3),
            affirmation(R.string.affirmation4),
            affirmation(R.string.affirmation5),
            affirmation(R.string.affirmation6),
            affirmation(R.string.affirmation7),
            affirmation(R.string.affirmation8),
            affirmation(R.string.affirmation9),
            affirmation(R.string.affirmation10)
        )
    }
}