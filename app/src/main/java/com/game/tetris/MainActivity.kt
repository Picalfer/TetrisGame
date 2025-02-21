package com.game.tetris

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.game.tetris.databinding.ActivityMainBinding

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

            }
        }
    }
}