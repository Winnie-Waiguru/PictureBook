package dev.exercise.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var nextbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextbtn=findViewById(R.id.nextbtn)

        nextbtn.setOnClickListener {
            val intent=Intent(this, PictureOneActivity::class.java)
            startActivity(intent)
        }

        }
    }
