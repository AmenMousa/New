package com.example.simpleapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.simpleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , View.OnClickListener{

    lateinit var binding : ActivityMainBinding


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnAdd.setOnClickListener(this)
        binding.btnSubtraction.setOnClickListener(this)
        binding.btnMultication.setOnClickListener(this)
        binding.btnDivision.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a = binding.etA.text.toString().toDouble()
        var b =  binding.etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add -> {
                result = a+b
            }
            R.id.btn_subtraction -> {
                result = a-b
            }
            R.id.btn_multication -> {
                result = a*b
            }
            R.id.btn_division -> {
                result = a/b
            }
        }
        binding.resultTv.text = "Result is $result"
        }
}