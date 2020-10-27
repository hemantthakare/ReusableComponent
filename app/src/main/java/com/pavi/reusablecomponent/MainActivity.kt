package com.pavi.reusablecomponent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pavi.reusablecomponentlibrary.DemoActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtHelloHemant.setOnClickListener {
            startActivity(Intent(this,DemoActivity::class.java))
        }
    }
}
