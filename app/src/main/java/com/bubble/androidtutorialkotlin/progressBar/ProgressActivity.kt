package com.bubble.androidtutorialkotlin.progressBar

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.bubble.androidtutorialkotlin.R
import kotlinx.android.synthetic.main.activity_progress.*
import kotlin.concurrent.thread

class ProgressActivity : AppCompatActivity() {
    private var handler: Handler = Handler()
    private var progressStatus: Int = 0
    private var secondaryHandler: Handler = Handler()

    private var primaryProgressStatus: Int = 0
    private var secondaryProgressStatus: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        progressBar2.progress = 1
        thread {
            while (progressStatus < 100) {
                progressStatus++

                handler.post {
                    progressBar2.progress += 1
                    progress_text.text = "${progressBar2.progress}/${progressBar2.max}"
                }
                try {
                    Thread.sleep(200)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }

        progressBar3.progress = 0
        thread {
            while (primaryProgressStatus < 100) {
                primaryProgressStatus++

                try {
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                startSecondaryProgress()
                secondaryProgressStatus = 0

                secondaryHandler.post {
                    progressBar3.progress = primaryProgressStatus
                    primary_progress_textView.text = "Completed $primaryProgressStatus out of 100%"

                    if (primaryProgressStatus == 100) {
                        primary_progress_textView.text = "Task Completed"
                    }
                }
            }
        }


    }

    private fun startSecondaryProgress() {
        thread {
            while (secondaryProgressStatus < 100) {
                secondaryProgressStatus++
                try {
                    Thread.sleep(200)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }

                secondaryHandler.post {
                    progressBar3.secondaryProgress = secondaryProgressStatus
                    secondary_progress_textView.text =
                        "Completed $secondaryProgressStatus out of 100%"

                    if (secondaryProgressStatus == 100) {
                        secondary_progress_textView.text = "Task Completed"
                    }
                }
            }
        }
    }
}