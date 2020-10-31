package com.bubble.androidtutorialkotlin.splashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.bubble.androidtutorialkotlin.R
import com.bubble.androidtutorialkotlin.main.MainListActivity

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_splash)

        Handler().postDelayed({
            val intent=Intent(this, MainListActivity::class.java)
            startActivity(intent)
            finish()
        },SPLASH_TIME_OUT)
    }
}