package com.stepview.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.fragmentAdd).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentMain, CollectionDemoFragment()).addToBackStack(null).commit()
        }
    }
}