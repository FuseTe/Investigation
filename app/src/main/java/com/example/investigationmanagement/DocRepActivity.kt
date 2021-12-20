package com.example.investigationmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class DocRepActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doc_rep)

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

        val documents = findViewById<LinearLayout>(R.id.linearLayout5)

        documents.setOnClickListener{
            startActivity(Intent(this,AllDocumentsActivity::class.java))
        }

        val reports = findViewById<LinearLayout>(R.id.linearLayout8)

        reports.setOnClickListener{
            startActivity(Intent(this,NotesDocsActivity::class.java))
        }
    }
}