package com.example.shakeib.intentresult

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn = findViewById<Button>(R.id.button_second_activty)

        var name = ""
        btn.setOnClickListener {
            val n = findViewById<EditText>(R.id.text_input)
            val i = Intent()
            name = n.text.toString()
            i.putExtra("name",name)
            setResult(Activity.RESULT_OK,i)
            finish()
        }
    }
}
