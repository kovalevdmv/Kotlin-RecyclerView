package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ButtonOnClock(view: View){
        val Ac2 = Intent(this, Main2Activity::class.java)
        startActivity(Ac2)
    }

    fun onClickBtn2(view: View){
        var i:Int=0;
        while(i<Integer.parseInt(count_eter.text.toString())) {
            i++
        }
        Toast.makeText(this, "123", Toast.LENGTH_SHORT).show()
    }
}
