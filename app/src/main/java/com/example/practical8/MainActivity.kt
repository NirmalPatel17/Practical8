package com.example.practical8

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.practical8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ad = AnimationDrawable()
        val f1 = resources.getDrawable(R.drawable.alarm1,null)
        val f2 = resources.getDrawable(R.drawable.alarm2,null)
        val f3 = resources.getDrawable(R.drawable.alarm3,null)
        val f4 = resources.getDrawable(R.drawable.alarm4,null)
        val f5 = resources.getDrawable(R.drawable.alarm5,null)
        val f6 = resources.getDrawable(R.drawable.alarm6,null)
        val f7 = resources.getDrawable(R.drawable.alarm7,null)
        val f8 = resources.getDrawable(R.drawable.alarm8,null)
        val f9 = resources.getDrawable(R.drawable.alarm9,null)
        val f10 = resources.getDrawable(R.drawable.alarm10,null)
        ad.addFrame(f1,200)
        ad.addFrame(f2,200)
        ad.addFrame(f3,200)
        ad.addFrame(f4,200)
        ad.addFrame(f5,200)
        ad.addFrame(f6,200)
        ad.addFrame(f7,200)
        ad.addFrame(f8,200)
        ad.addFrame(f9,200)
        ad.addFrame(f10,200)
        binding.imageAlarmFrame.background = ad
        ad.start()

        val ad1 = AnimationDrawable()
        val heart1 = resources.getDrawable(R.drawable.ic_heart_0,null)
        val heart2 = resources.getDrawable(R.drawable.ic_heart_25,null)
        val heart3 = resources.getDrawable(R.drawable.ic_heart_50,null)
        val heart4 = resources.getDrawable(R.drawable.ic_heart_75,null)
        val heart5 = resources.getDrawable(R.drawable.ic_heart_100,null)

        ad1.addFrame(heart1,250)
        ad1.addFrame(heart2,250)
        ad1.addFrame(heart3,250)
        ad1.addFrame(heart4,250)
        ad1.addFrame(heart5,250)
        binding.imageHeartFrame.background = ad1
        ad1.start()
    }
}