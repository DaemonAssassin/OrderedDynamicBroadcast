package com.gmail.mateendev3.orderedbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class Receiver1 : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.v("TAGG", "Han bhai123")
        Toast.makeText(context, "Receiver1", Toast.LENGTH_SHORT).show()
    }
}