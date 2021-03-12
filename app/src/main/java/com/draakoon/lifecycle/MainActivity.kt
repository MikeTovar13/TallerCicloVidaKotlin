package com.draakoon.lifecycle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.draakoon.ciclelife.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button_init)

        button.setOnClickListener() {

            val intent = Intent(this, SegundaActivity::class.java )
            intent.putExtra("user_name", "Mike")
            startActivity(intent);

            return@setOnClickListener;
        }

    }

    var count: Int = 0;

    private fun countChanges() {
        val textChange: TextView = findViewById(R.id.textChange)
        this.count++
        textChange.text = resources.getString(R.string.text_count_next) + " " + this.count
    }

    override fun onResume() {
        super.onResume()

        this.countChanges()
    }

    override fun onStop() {
        super.onStop()

    }

    override fun onDestroy() {
        super.onDestroy()

    }
}