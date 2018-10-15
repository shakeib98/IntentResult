package com.example.shakeib.intentresult

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val MY_KEY = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_one)
        btn.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            startActivityForResult(i,MY_KEY)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == MY_KEY && resultCode == Activity.RESULT_OK){
            val t = findViewById<TextView>(R.id.text)
            t.text = data?.getStringExtra("name").toString()
        }
    }
}
