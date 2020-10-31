package com.bubble.androidtutorialkotlin.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bubble.androidtutorialkotlin.R
import com.bubble.androidtutorialkotlin.radio_button.RadioButtonActivity
import com.bubble.androidtutorialkotlin.button.ButtonActivity
import com.bubble.androidtutorialkotlin.checkBox.CheckBoxActivity
import com.bubble.androidtutorialkotlin.chip.ChipActivity
import com.bubble.androidtutorialkotlin.editText.EditTextActivity
import com.bubble.androidtutorialkotlin.floatingAction.FloatingButtonActivity
import com.bubble.androidtutorialkotlin.notification.NotificationActivity
import com.bubble.androidtutorialkotlin.progressBar.ProgressActivity
import com.bubble.androidtutorialkotlin.ratingBar.RatingActivity
import com.bubble.androidtutorialkotlin.seekBar.SeekbarActivity
import com.bubble.androidtutorialkotlin.splashScreen.SplashActivity
import com.bubble.androidtutorialkotlin.tabLayout.MainTabActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main_list.*


class MainListActivity : AppCompatActivity() {


    private lateinit var recycleViews :RecyclerView
    private val activityList= mutableListOf<activityModal>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.toolbar))
        setContentView(R.layout.activity_main_list)

        recycleViews=findViewById(R.id.recycleView)
        init()

        val main_view:ConstraintLayout=findViewById(R.id.main_layout)

    }
    private fun init() {
        recycleViews.apply {
            layoutManager=LinearLayoutManager(this@MainListActivity)
            itemAnimator=DefaultItemAnimator()
            addItemActivityList()
            adapter= RecycleAdapter(activityList){ item->
                startActivity(item.intent)
            }
        }
    }

    private fun addItemActivityList() {

//       Edit Text Activity
        activityList.add(activityModal(
            "Edit Text",
            "Text",
            Intent(this,EditTextActivity::class.java)))

//        Button Activity
        activityList.add(activityModal(
            "Button",
            "Buttons",
            Intent(this, ButtonActivity::class.java)))

//        Tab Layout Activity
        activityList.add(activityModal(
            "Tab Layout",
            "Containers",
            Intent(this,MainTabActivity::class.java)))

//        Chips Activity
        activityList.add(activityModal(
            "Chips",
            "Buttons",
            Intent(this,ChipActivity::class.java)))

//        Check Box Activity
        activityList.add(activityModal(
            "Check box",
            "Containers",
            Intent(this,CheckBoxActivity::class.java)))

//        Floating Activity
        activityList.add(activityModal(
            "Floating",
            "Buttons",
            Intent(this,FloatingButtonActivity::class.java)))

//        Radio & Switch Activity,
        activityList.add(activityModal(
            "Radio Button",
            "Buttons",
            Intent(this,RadioButtonActivity::class.java)))

//        Progress Bar
        activityList.add(activityModal(
            "Progress Bar",
            "Containers",
            Intent(this,ProgressActivity::class.java)))

//        Rating Bar
        activityList.add(activityModal(
            "Rating Bar",
            "Widgets",
            Intent(this,RatingActivity::class.java)))

//        Seek Bar
        activityList.add(activityModal(
            "Seek Bar",
            "Widgets",
            Intent(this,SeekbarActivity::class.java)))

//        Splash Activity
        activityList.add(activityModal(
            "Splash",
            "UI",
            Intent(this, SplashActivity::class.java)))

//        Notification Activity
        activityList.add(activityModal(
            "Notification",
            "Advance",
            Intent(this, NotificationActivity::class.java)))

//        basic_component_list.add(ComponentModal("Edit Text",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Splash Screen",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Recycle View",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Spinner",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Progress Bar",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Switch",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Switch",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Rating Bar",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Time Picker",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Database sqlite3",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Settings",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Time Picker",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Notification",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Radio Group",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("FireBase",Intent(this,ButtonActivity::class.java)))
//        basic_component_list.add(ComponentModal("Login Page",Intent(this,ButtonActivity::class.java)))
    }




}