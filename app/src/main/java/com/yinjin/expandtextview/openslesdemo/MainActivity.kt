package com.yinjin.expandtextview.openslesdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.res.AssetManager


class MainActivity : AppCompatActivity() {
    var assetManager: AssetManager? = null
    private val voiceUtil: VoiceUtil by lazy { VoiceUtil() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        assetManager = assets

        // Example of a call to a native method
        tv2.setOnClickListener {
            voiceUtil.playAsset(assetManager, "mydream.m4a")
        }
        stop.setOnClickListener {
            voiceUtil.stop()
        }
        pause.setOnClickListener {
            voiceUtil.pause()
        }
        play.setOnClickListener { voiceUtil.replay() }

    }

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

}
