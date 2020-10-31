package com.bubble.androidtutorialkotlin.chip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bubble.androidtutorialkotlin.R
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.snackbar.Snackbar

class ChipActivity : AppCompatActivity() {

    private lateinit var chipGroup:ChipGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chip)

        chipGroup=findViewById(R.id.chip_group)

        chipGroup.setOnCheckedChangeListener { chipGroup: ChipGroup, i: Int ->
            val chip: Chip = chipGroup.findViewById(i)

            Snackbar.make(chipGroup, "this is chip ${chip.text}", Snackbar.LENGTH_SHORT).setAction("Action",null).show()
//            Toast.makeText(this, "this is chip ${chip.text}", Toast.LENGTH_SHORT).show()
        }

        val chip = findViewById<Chip>(R.id.chip)
        chip.setOnCloseIconClickListener{
            Snackbar.make(it, "Closed Chip is clicked ${chip.text}", Snackbar.LENGTH_SHORT).setAction("Action",null).show()

//            Toast.makeText(this, "Closed Chip is clicked ${chip.text}", Toast.LENGTH_SHORT).show()
        }
    }
}