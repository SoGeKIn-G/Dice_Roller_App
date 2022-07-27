package com.gauravbora.ludo_diceroller_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: Button =findViewById(R.id.RollButton)

        button.setOnClickListener{
            buttonClick()
        }

    }
private fun  buttonClick(){

    val count: Int = (1..6).random()
    val text:TextView=findViewById(R.id.textView)
    val image:ImageView=findViewById(R.id.diceImg)
    val also = 67F.also { text.textSize = it }
    when(count){
        1->  {
                text.setText("1")
                val drawbleResource=R.drawable.dice_1
                image.setImageResource(drawbleResource)
            }
        2->{
            text.setText("2")
            val drawbleResource=R.drawable.dice_2
            image.setImageResource(drawbleResource)
        }
        3->{
            text.setText("3")
            val drawbleResource=R.drawable.dice_3
            image.setImageResource(drawbleResource)
        }
        4->
        {
            text.setText("4")
            val drawbleResource=R.drawable.dice_4
            image.setImageResource(drawbleResource)
        }
        5->
        {
            text.setText("5")
            val drawbleResource=R.drawable.dice_5
            image.setImageResource(drawbleResource)
        }
        else->
        {
            text.setText("6")
            val drawbleResource=R.drawable.dice_6
            image.setImageResource(drawbleResource)
        }
    }
}
}

