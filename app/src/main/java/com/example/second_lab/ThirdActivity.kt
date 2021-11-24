package com.example.second_lab

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.example.second_lab.databinding.ActivityThirdBinding

class ThirdActivity : AbstractClass() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnToFirst.setOnClickListener{
            toFirst()
        }
        binding.bnToSecond.setOnClickListener{
            toSecond()
        }
    }

    private fun toFirst() {
        this.setResult(Activity.RESULT_OK)
        finish()
    }

    private fun toSecond() {
        finish()
    }
}