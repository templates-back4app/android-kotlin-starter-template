package com.back4app.kotlin.back4appexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.parse.Parse

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
    }
}