package com.bubble.androidtutorialkotlin.checkBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bubble.androidtutorialkotlin.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_check_box.*

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        CB_option1.setOnClickListener {
            Snackbar.make(it, "${CB_option1.text} set to ${CB_option1.isChecked}", Snackbar.LENGTH_SHORT).show()
        }
        Button_check.setOnClickListener {
            var checklist: String? =null

            if (CB_option1.isChecked){
                checklist += "${CB_option1.text}\n"
            }
            if (CB_option2.isChecked){
                checklist += "${CB_option2.text}\n"
            }
            if (CB_option3.isChecked){
                checklist += "${CB_option3.text}\n"
            }
            if (CB_option4.isChecked){
                checklist += "${CB_option4.text}\n"
            }
            if (CB_option5.isChecked){
                checklist += "${CB_option5.text}\n"
            }

            TV_output.text="Selected Option \n $checklist"
        }
    }
}