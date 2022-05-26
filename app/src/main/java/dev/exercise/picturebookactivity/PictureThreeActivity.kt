package dev.exercise.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureThreeActivity : AppCompatActivity() {
    lateinit var previousThreebtn:Button
    lateinit var nextThreebtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_three)
        previousThreebtn=findViewById(R.id.previousThreebtn)
        nextThreebtn=findViewById(R.id.nextThreebtn)

        previousThreebtn.setOnClickListener {
            val intent=Intent(this, PictureTwoActivity::class.java)
            startActivity(intent)
        }
        nextThreebtn.setOnClickListener {
            val intent=Intent(this, PictureFourActivity::class.java)
            startActivity(intent)
        }
    }
}