package com.sowon.a1_fruite_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.sowon.a1_fruite_study.databinding.ActivityRandomBinding

class RandomActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRandomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_random) // view를 엮어줌

        binding.fruitRandomBtn.setOnClickListener{ // 버튼을 클릭하면
            Toast.makeText(this, "랜덤 돌리기", Toast.LENGTH_LONG).show()
        }
    }
}