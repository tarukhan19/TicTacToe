package com.project.tictactoe

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.project.tictactoe.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList
var singleUser = false

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        initialize()

    }

    private fun initialize() {
        sigleplayerBTN.setOnClickListener(this)
        multiplayerBTN.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.sigleplayerBTN -> {
                val intent = Intent(this, PlayerActivity::class.java)
                startActivity(intent)
                 singleUser = true

            }

            R.id.multiplayerBTN -> {
                val intent = Intent(this, PlayerActivity::class.java)
                startActivity(intent)
                singleUser=false
            }

        }
    }


}