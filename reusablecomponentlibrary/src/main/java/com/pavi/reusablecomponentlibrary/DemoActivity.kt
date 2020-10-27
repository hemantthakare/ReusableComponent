package com.pavi.reusablecomponentlibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widgetkitlibrary.WidgetKitLibraryActivity
import kotlinx.android.synthetic.main.activity_demo.*

class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        tvDemoActivity.setOnClickListener {
            startActivity(Intent(this,WidgetKitLibraryActivity::class.java))
        }
    }
}
