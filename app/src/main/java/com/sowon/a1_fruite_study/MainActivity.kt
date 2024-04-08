package com.sowon.a1_fruite_study

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 프로그램이 화면이 클릭 된 것을 알게 함
        val image1 = findViewById<ImageView>(R.id.fruit_image_1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 사진 클릭", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면 다른 화면으로 넘어감 - Activity 화면 전환
            var intent = Intent(this, Fruit1Activity::class.java)
            startActivity(intent)


        }
    }
}
