package com.bubble.androidtutorialkotlin.button

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.bubble.androidtutorialkotlin.R
import com.google.android.material.snackbar.Snackbar

class ButtonActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var imageButton:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        button=findViewById(R.id.button)
        imageButton=findViewById(R.id.imageButton)

        button.setOnClickListener {
            Snackbar.make(it, "Button Clicked :)", Snackbar.LENGTH_SHORT).setAction("Action",null).show()
        }

        imageButton.setOnClickListener {
            Snackbar.make(it, "Image Clicked :)", Snackbar.LENGTH_SHORT).setAction("Action",null).show()
        }
    }
}