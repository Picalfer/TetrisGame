package com.game.tetris

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.game.tetris.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnExit.setOnClickListener {
                finish()
            }

            btnNewGame.setOnClickListener {
                val intent = Intent(this@MainActivity, GameActivity::class.java)
                startActivity(intent)
            }

            btnResetScore.setOnClickListener {
                val preferences = AppPreferences(this@MainActivity)
                preferences.clearHighScore()

                Snackbar.make(binding.root, "Score successfully reset", Snackbar.LENGTH_SHORT).show()
                tvHighScore.text = "High score: ${preferences.getHighScore()}"
            }
        }
    }
}