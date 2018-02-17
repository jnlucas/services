package com.example.logonrm.alarmemanager

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log
import android.widget.Toast

/**
 * Created by logonrm on 17/02/2018.
 */
class MeuServico : Service() {
    lateinit var mp: MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
         super.onStartCommand(intent, flags, startId)

       if(intent?.extras != null){
           Log.i("TEST",intent?.getStringExtra("parametro1"))

       }

        mp = MediaPlayer.create(this, R.raw.vaidarmerdavaaaai)
        mp!!.start()

        Toast.makeText(this,"iniciando alarme", Toast.LENGTH_LONG).show()

        return Service.START_REDELIVER_INTENT

    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}