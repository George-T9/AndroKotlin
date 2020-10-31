package com.bubble.androidtutorialkotlin.radio_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.bubble.androidtutorialkotlin.R
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.switchmaterial.SwitchMaterial
import kotlinx.android.synthetic.main.activity_radio_button.*

class RadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            val radioButton:RadioButton=radioGroup.findViewById(i)
            Snackbar.make(radioGroup,
                "Radio Button ${radioButton.text} ${radioButton.isChecked}",
                Snackbar.LENGTH_LONG)
                .setAction("Action",null).show()
        }

        var switch:SwitchMaterial = findViewById(R.id.switchMaterial)

        switch.setOnCheckedChangeListener { compoundButton, b ->
            Snackbar.make(compoundButton,"${compoundButton.isChecked}",Snackbar.LENGTH_LONG).show()
        }
    }
}