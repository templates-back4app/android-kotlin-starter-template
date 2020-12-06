package com.back4app.kotlin.back4appexample

import android.app.Application
import com.parse.Parse

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        Parse.initialize(
                Parse.Configuration.Builder(this)
                        .applicationId(getString(R.string.parse_app_id))
                        .clientKey(getString(R.string.parse_client_key))
                        .server(getString(R.string.parse_server_url))
                        .build());

    }


}