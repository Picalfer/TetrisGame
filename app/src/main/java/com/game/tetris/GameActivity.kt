package com.game.tetris

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.game.tetris.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameBinding
    private var appPreferences: AppPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        appPreferences = AppPreferences(this)

        updateHighScore()
        updateCurrentScore()
    }

    private fun updateHighScore() {
        binding.tvHighScore.text = appPreferences?.getHighScore().toString()
    }

    private fun updateCurrentScore() {
        binding.tvCurrentScore.text = "0"
    }
}