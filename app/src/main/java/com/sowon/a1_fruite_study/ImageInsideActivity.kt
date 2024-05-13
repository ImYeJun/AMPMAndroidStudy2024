package com.sowon.a1_fruite_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        var getdata = intent.getStringExtra("data")
        val fruitImage = findViewById<ImageView>(R.id.fruitImageArea)

//        Toast.makeText(this, getdata, Toast.LENGTH_LONG).show()

        if (getdata == "1"){
            fruitImage.setImageResource(R.drawable.img_1_apple)
        }
        if (getdata == "2"){
            fruitImage.setImageResource(R.drawable.img_2_banana)
        }
        if (getdata == "3"){
            fruitImage.setImageResource(R.drawable.img_3_carrot)
        }
        if (getdata == "4"){
            fruitImage.setImageResource(R.drawable.img_4_potato)
        }
        if (getdata == "5"){
            fruitImage.setImageResource(R.drawable.img_5_watermelon)
        }
        if (getdata == "6"){
            fruitImage.setImageResource(R.drawable.img_6_strawberry)
        }
        if (getdata == "7"){
            fruitImage.setImageResource(R.drawable.img_7_peach)
        }
    }
}