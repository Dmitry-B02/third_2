package com.example.second_lab

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.example.second_lab.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toFirst.setOnClickListener{
            toFirst()
        }
        binding.toSecond.setOnClickListener{
            toSecond()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.about_item) {
            startActivity(Intent(this, AboutActivity::class.java))
            true
        } else
            super.onOptionsItemSelected(item)
    }

    private fun toFirst() {
        this.setResult(Activity.RESULT_OK)
        finish()
    }

    private fun toSecond() {
        finish()
    }
}