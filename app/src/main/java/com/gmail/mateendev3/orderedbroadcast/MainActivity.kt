package com.gmail.mateendev3.orderedbroadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var mReceiver1: Receiver1
    private lateinit var mReceiver2: Receiver2
    private lateinit var mReceiver3: Receiver3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSendBroadcast: Button = findViewById(R.id.btn_send_broadcast)
        btnSendBroadcast.setOnClickListener {
            val intent = Intent("YO_Buddy")
            Log.v("TAGG", "Han bhai")
            sendOrderedBroadcast(intent, null)
        }

        mReceiver1 = Receiver1()
        mReceiver2 = Receiver2()
        mReceiver3 = Receiver3()

        val filter1 = IntentFilter("YO_Buddy")
        filter1.priority = 10
        val filter2 = IntentFilter("YO_Buddy")
        filter2.priority = 20
        val filter3 = IntentFilter("YO_Buddy")
        filter3.priority = 30

        registerReceiver(mReceiver1, filter1)
        registerReceiver(mReceiver2, filter2)
        registerReceiver(mReceiver3, filter3)
    }

    override fun onDestroy() {
        unregisterReceiver(mReceiver1)
        unregisterReceiver(mReceiver2)
        unregisterReceiver(mReceiver3)
        super.onDestroy()
    }
}