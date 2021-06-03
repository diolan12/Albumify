package com.netcode.songify.ui.splash

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.netcode.songify.R
import com.netcode.songify.databinding.ActivitySplashBinding
import com.netcode.songify.ui.main.MainActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.splashName.animation = AnimationUtils.loadAnimation(this, R.anim.anim_splash_name)
        goToMain()
    }

    private fun goToMain() = lifecycleScope.launch {
        delay(2000)
        Intent(this@SplashActivity, MainActivity::class.java).apply {
            startActivity(this)
            finish()
        }
    }

}