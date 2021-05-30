package com.example.myapplication10.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firstlibrary.Math
import com.example.myapplication10.R

class MainActivity : AppCompatActivity() {
    var math=Math()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this@MainActivity, "hi", Toast.LENGTH_SHORT).show()
    }
}