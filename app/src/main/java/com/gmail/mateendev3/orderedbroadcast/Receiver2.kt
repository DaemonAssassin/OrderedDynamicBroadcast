package com.gmail.mateendev3.orderedbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Receiver2 : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Receiver2", Toast.LENGTH_SHORT).show()
    }
}