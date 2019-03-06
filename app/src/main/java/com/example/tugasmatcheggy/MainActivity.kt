package com.example.tugasmatcheggy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        eggy3.setOnClickListener { kocok () }
    }

    fun kocok() {
        val randomCewek = Random().nextInt (3)+1
        val randomCowok = Random().nextInt (3)+1
        val drawableResCowok = when(randomCowok){
            1 -> R.drawable.cowok1
            2 -> R.drawable.cowok2
            else -> R.drawable.cowok3
        }
        val drawableResCewek = when(randomCewek){
            1 -> R.drawable.cewek1
            2 -> R.drawable.cewek2
            else -> R.drawable.cewek3
        }
        eggy1.setImageResource(drawableResCowok)
        eggy2.setImageResource(drawableResCewek)
    }
}
