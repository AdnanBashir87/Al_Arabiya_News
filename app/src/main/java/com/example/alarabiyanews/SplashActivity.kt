package com.example.alarabiyanews

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val loading = findViewById<LottieAnimationView>(R.id.animationView)

        Handler().postDelayed({
            loading.playAnimation()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 5000)

    }
}