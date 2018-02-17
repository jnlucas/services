package com.example.logonrm.alarmemanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.provider.MediaStore
import android.widget.Toast

/**
 * Created by logonrm on 17/02/2018.
 */
class AlarmReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val i = Intent(context, MeuServico::class.java)

        i.putExtra("parametro1", "oi")
        context?.startService(i);
    }

}