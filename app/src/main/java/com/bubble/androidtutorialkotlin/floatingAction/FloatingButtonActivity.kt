package com.bubble.androidtutorialkotlin.floatingAction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import com.bubble.androidtutorialkotlin.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_floating_button.*

class FloatingButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_button)

        val activityView:RelativeLayout=findViewById(R.id.main_layout)
        floatingActionButton.setOnClickListener{
            Snackbar.make(activityView,"fab clicked",Snackbar.LENGTH_LONG).setAction("Action",null).show()
        }
    }
}