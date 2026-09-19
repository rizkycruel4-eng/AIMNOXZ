package com.zinmods.aimnoxz

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(9, 11, 16))
        }

        val title = TextView(this).apply {
            text = "AimNoxZ"
            textSize = 32f
            setTextColor(Color.WHITE)
            typeface = Typeface.DEFAULT_BOLD
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Aim Trainer + Touch Performance"
            textSize = 14f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 8, 0, 32)
        }

        val status = TextView(this).apply {
            text = "SYSTEM READY"
            textSize = 14f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            setPadding(0, 16, 0, 24)
        }

        val button = Button(this).apply {
            text = "START"
            textSize = 16f
            setOnClickListener {
                status.text = "AIM TRAINER ACTIVE"
            }
        }

        root.addView(title)
        root.addView(subtitle)
        root.addView(status)
        root.addView(button)

        setContentView(root)
    }
}
