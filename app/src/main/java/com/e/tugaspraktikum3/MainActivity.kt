package com.e.tugaspraktikum3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgBtn = findViewById<ImageButton>(R.id.btnKirim)
        imgBtn.setOnClickListener {
            Toast.makeText( this@MainActivity,"Berhasil", Toast.LENGTH_LONG).show()
        }
        val imgBtn2 = findViewById<ImageButton>(R.id.btnCancel)
        imgBtn2.setOnClickListener {
            Toast.makeText( this@MainActivity,"Batal", Toast.LENGTH_LONG).show()
        }
    }
}