package com.game.tetris

import android.content.Context
import android.content.SharedPreferences

class AppPreferences(context: Context) {
    var data: SharedPreferences = context.getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE)

    fun saveHighScore(highScore: Int) {
        data.edit().putInt("HIGH_SCORE", highScore).apply()
    }

    fun getHighScore() = data.getInt("HIGH_SCORE", 0)

    fun clearHighScore() {
        data.edit().putInt("HIGH_SCORE", 0).apply()
    }
}