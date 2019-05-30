package com.schaefer.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_roll.setOnClickListener {
            rollTheDice()
        }
    }

    private fun rollTheDice() {
        imageView_dice.setImageDrawable(
            when (Random().nextInt(6) + 1) {
                1 -> resources.getDrawable(R.drawable.dice_1)
                2 -> resources.getDrawable(R.drawable.dice_2)
                3 -> resources.getDrawable(R.drawable.dice_3)
                4 -> resources.getDrawable(R.drawable.dice_4)
                5 -> resources.getDrawable(R.drawable.dice_5)
                else -> resources.getDrawable(R.drawable.dice_5)
            }
        )
    }
}
