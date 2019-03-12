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
        val randomCewek = Random().nextInt (6)+1
        val randomCowok = Random().nextInt (6)+1
        val drawableResCowok = when(randomCowok){
            1 -> R.drawable.filipus
            2 -> R.drawable.hafid
            3 -> R.drawable.haris
            4 -> R.drawable.huda
            5 -> R.drawable.iav
            else -> R.drawable.luhur
        }
        val drawableResCewek = when(randomCewek){
            1 -> R.drawable.ayu
            2 -> R.drawable.faliz
            3 -> R.drawable.fuji
            4 -> R.drawable.hanum
            5 -> R.drawable.mela
            else -> R.drawable.umi
        }
        eggy1.setImageResource(drawableResCowok)
        eggy2.setImageResource(drawableResCewek)
    }
}
