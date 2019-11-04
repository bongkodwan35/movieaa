package com.example.ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity_ex : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex)
    }
    fun factone (v: View) {
        val intent = Intent(this, Nexepage_one::class.java)
        startActivity(intent)
    }
    fun nexttwo (v: View) {
        val intent = Intent(this, Nextpage_two::class.java)
        startActivity(intent)
    }
    fun nextthree (v: View) {
        val intent = Intent(this, Nextpage_three::class.java)
        startActivity(intent)
    }
    fun nextfour (v: View) {
        val intent = Intent(this, Nextpage_four::class.java)
        startActivity(intent)
    }
    fun nextfive (v: View) {
        val intent = Intent(this, Nextpage_five::class.java)
        startActivity(intent)
    }
    fun nextsix (v: View) {
        val intent = Intent(this, Nextpage_six::class.java)
        startActivity(intent)
    }

}
