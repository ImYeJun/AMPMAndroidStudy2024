package com.sowon.a1_fruite_study

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // 1. 사진을 클릭했을 때 메세지 띄우기 by Toast
//        val image1 = findViewById<ImageView>(R.id.fruit1)
//        image1.setOnClickListener {
//            Toast.makeText(this, "1번 사진 클릭", Toast.LENGTH_LONG).show()
//
//            // 2. 화면이 클릭되면 다른 화면으로 넘어감
//            // 구글링 : "안드로이드 스튜디오 화면전환 kotlin"
//            var intent = Intent(this, Fruit1Activity::class.java)
//            startActivity(intent)
//
//        }

//        Log.d("MainActivity","testlog")
        val test = "this is test msg"
        Log.e("MainActivity", test)
        Log.w("MainActivity", test)
        Log.i("MainActivity", test)
        Log.d("MainActivity", test)
        Log.v("MainActivity", test)

        val btn1 = findViewById<ImageView>(R.id.fruit1)
        val btn2 = findViewById<ImageView>(R.id.fruit2)
        val btn3 = findViewById<ImageView>(R.id.fruit3)
        val btn4 = findViewById<ImageView>(R.id.fruit4)
        val btn5 = findViewById<ImageView>(R.id.fruit5)
        val btn6 = findViewById<ImageView>(R.id.fruit6)
        val btn7 = findViewById<ImageView>(R.id.fruit7)

        btn1.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }

        btn2.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }

        btn3.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)
        }

        btn4.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)
        }

        btn5.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)
        }
        btn6.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)
        }

        btn7.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)
        }


    }
}
