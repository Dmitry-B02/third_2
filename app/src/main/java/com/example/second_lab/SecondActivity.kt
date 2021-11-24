package com.example.second_lab

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.example.second_lab.databinding.ActivitySecondBinding

class SecondActivity : AbstractClass() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnToFirst.setOnClickListener{
            toFirst()
        }
        binding.bnToThird.setOnClickListener{
            toThird()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RESULT_CODE && resultCode == Activity.RESULT_OK) {
            finish()
        }
    }

    private fun toFirst() {
        finish()
    }


    private fun toThird() {
        startActivityForResult(Intent(this, ThirdActivity::class.java), RESULT_CODE)
    }


    companion object {
        const val RESULT_CODE = 0
    }
}