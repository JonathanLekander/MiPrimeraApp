package com.catedra.miprimeraapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.title = "Details"
        val name = intent.getStringExtra("name") ?: ""

        val textHello = findViewById<TextView>(R.id.textHello)
        val textInitial = findViewById<TextView>(R.id.textInitial)
        val buttonBack = findViewById<Button>(R.id.buttonBack)

        textHello.text = getString(R.string.hello_name, name)
        textInitial.text = name.firstOrNull()?.uppercase() ?: ""

        buttonBack.setOnClickListener {
            finish()
        }
    }
}