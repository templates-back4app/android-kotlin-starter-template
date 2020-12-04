package com.back4app.kotlin.back4appexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.parse.Parse
import com.parse.ParseObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Parse.initialize(
            Parse.Configuration.Builder(this)
            .applicationId(getString(R.string.parse_app_id))
            .clientKey(getString(R.string.parse_client_key))
            .server(getString(R.string.parse_server_url))
            .build());

        val textView = findViewById<TextView>(R.id.textView)

        val firstObject = ParseObject("FirstClass")
        firstObject.put("message","Hey ! First message from android. Parse is now connected")
        firstObject.saveInBackground {
            if (it != null){
                it.localizedMessage?.let { message -> Log.e("MainActivity", message) }
            }else{
                Log.d("MainActivity","Object saved.")
                textView.text = String.format("Object saved. %s", firstObject.objectId)
            }
        }
    }
}