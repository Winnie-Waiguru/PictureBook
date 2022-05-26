package dev.exercise.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureTwoActivity : AppCompatActivity() {
    lateinit var previous2btn:Button
    lateinit var next2btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_two)

        previous2btn=findViewById(R.id.previous2btn)
        next2btn=findViewById(R.id.next2btn)

        previous2btn.setOnClickListener {
            val intent=Intent(this, PictureOneActivity::class.java)
            startActivity(intent)
        }
        next2btn.setOnClickListener {
            val intent=Intent(this, PictureThreeActivity::class.java)
            startActivity(intent)
        }
    }
}