package dev.exercise.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFourActivity : AppCompatActivity() {
    lateinit var previousfourbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_four)
        previousfourbtn=findViewById(R.id.previousfourbtn)

        previousfourbtn.setOnClickListener {
            val intent=Intent(this, PictureThreeActivity::class.java)
            startActivity(intent)
        }
    }
}