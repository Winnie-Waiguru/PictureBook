package dev.exercise.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureOneActivity : AppCompatActivity() {
    lateinit var previousbtn:Button
    lateinit var next1btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_one)
        previousbtn=findViewById(R.id.previousbtn)
        next1btn=findViewById(R.id.next1btn)


        previousbtn.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        next1btn.setOnClickListener {
            val intent=Intent(this, PictureTwoActivity::class.java)
            startActivity(intent)
        }



        }
    }
