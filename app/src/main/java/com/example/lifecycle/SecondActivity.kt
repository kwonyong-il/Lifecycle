package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.lifecycle.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        Log.d("SecondActivity","onCreate succeed")
        setContentView(binding.root)

    }
    override fun onStart() {
        super.onStart()
        Log.d("SecondActivity", "onStart succeed")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity", "onResume succeed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity", "onPause succeed")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity", "onStop succeed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "onDestroy succeed")
    }
}
