package com.example.logonrm.alarmemanager

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var alarmReceiver: BroadcastReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btDisparar.setOnClickListener({
            disparar()

        })


    }

     fun disparar(){

         val tempo = Integer.parseInt(edSegundos.text.toString())
         val intent = Intent(this,AlarmReceiver::class.java)
         val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)
         val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

         alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + (tempo * 1000), pendingIntent)






     }


}
