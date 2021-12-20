package com.example.investigationmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RecentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recent)

        val post = findViewById<ImageView>(R.id.post)

        post.setOnClickListener{
            startActivity(Intent(this,SearchActivity::class.java))
        }

        val work = findViewById<ImageView>(R.id.work)

        work.setOnClickListener{
            startActivity(Intent(this,DocRepActivity::class.java))
        }

        val record = findViewById<ImageView>(R.id.record)

        record.setOnClickListener{
            startActivity(Intent(this,RecordsActivity::class.java))
        }
    }
}