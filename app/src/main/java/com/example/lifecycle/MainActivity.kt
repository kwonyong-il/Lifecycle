package com.example.lifecycle
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import com.example.lifecycle.databinding.ActivityMainBinding
import java.time.Duration

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("MainActivity", "onCreate succeed")

        binding.secondBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            showToast("Hello World",5000)
        }
        binding.fragmentBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.fragment,FirstFragment()).commit()
        }
        binding.exitFragmentBtn.setOnClickListener{
            val fragment = supportFragmentManager.findFragmentById(R.id.fragment)
            if(fragment != null) {
                supportFragmentManager.beginTransaction().remove(fragment).commit()
                supportFragmentManager.popBackStack()
            }
        }
    }
    fun Context.showToast(message:String, duration: Int) = Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

        override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart succeed")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume succeed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause succeed")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop succeed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy succeed")
    }
}