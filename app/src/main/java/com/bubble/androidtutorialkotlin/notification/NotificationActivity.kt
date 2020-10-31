package com.bubble.androidtutorialkotlin.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import com.bubble.androidtutorialkotlin.R
import com.bubble.androidtutorialkotlin.chip.ChipActivity

class NotificationActivity : AppCompatActivity() {


    lateinit var notificationManager:NotificationManager
    lateinit var notificationChannel:NotificationChannel
    lateinit var builder :NotificationCompat.Builder
    var channel_id = "com.bubble.androidkotlin.notification"
    var description=" Test Description "

    private lateinit var btNotication:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)


        btNotication=findViewById(R.id.BT_Notification)

        notificationManager= getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        btNotication.setOnClickListener {

            val intent:Intent= Intent(this,ChipActivity::class.java)

            val pendingIntent:PendingIntent= PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                notificationChannel = NotificationChannel(channel_id,description,NotificationManager.IMPORTANCE_HIGH)
                notificationChannel.enableLights(true)
                notificationChannel.lightColor=Color.MAGENTA
                notificationChannel.enableVibration(true)
                notificationManager.createNotificationChannel(notificationChannel)

                builder = NotificationCompat.Builder(this,channel_id)
                    .setSmallIcon(R.drawable.ic_baseline_check_24)
                    .setContentTitle("this is title")
                    .setContentText("this is content")
                    .setStyle(NotificationCompat.BigTextStyle().bigText("this will be tooo long text,which cant come in one line"))
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setContentIntent(pendingIntent)
            }else{
                builder = NotificationCompat.Builder(this)
                    .setSmallIcon(R.drawable.ic_baseline_check_24)
                    .setContentTitle("this is title")
                    .setContentText("this is content")
                    .setStyle(NotificationCompat.BigTextStyle().bigText("this will be tooo long text,which cant come in one line"))
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setContentIntent(pendingIntent)
            }
            notificationManager.notify(1234,builder.build())
        }
    }



    private fun createNotificationChannel(){
        btNotication

    }
}