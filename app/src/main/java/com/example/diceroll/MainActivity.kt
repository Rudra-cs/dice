package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.iv_image)

        val roll: Button = findViewById(R.id.btn_roll)
        roll.setOnClickListener{
            rollDice()
        }

    }

    private fun rollDice() {

        val randomInt =(1..6).random()

        val resource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else-> R.drawable.dice_6

        }

        diceImage.setImageResource(resource)
        Toast.makeText(this,"The Dice roll no. is $randomInt",Toast.LENGTH_SHORT).show()
    }
}
