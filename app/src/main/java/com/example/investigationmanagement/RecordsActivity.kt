package com.example.investigationmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class RecordsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_records)

        val post = findViewById<ImageView>(R.id.post)

        post.setOnClickListener{
            startActivity(Intent(this,SearchActivity::class.java))
        }

        val work = findViewById<ImageView>(R.id.work)

        work.setOnClickListener{
            startActivity(Intent(this,DocRepActivity::class.java))
        }

        val add = findViewById<ImageView>(R.id.add)

        add.setOnClickListener{
            startActivity(Intent(this,NewVoiceActivity::class.java))
        }
    }
}