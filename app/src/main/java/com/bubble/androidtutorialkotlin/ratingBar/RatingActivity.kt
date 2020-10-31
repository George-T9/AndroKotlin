package com.bubble.androidtutorialkotlin.ratingBar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bubble.androidtutorialkotlin.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_rating.*

class RatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        button2.setOnClickListener {
            Snackbar.make(it,"${ratingBar.rating} out of ${ratingBar.numStars}",Snackbar.LENGTH_SHORT).setAction("Action",null).show()
        }
    }
}