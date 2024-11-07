package com.example.ex_02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ex_02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

        private val binding by lazy{
            ActivityMainBinding.inflate(layoutInflater)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)


            binding.buttonConversor.setOnClickListener{
            var euros: Double = binding.editTextEuro.text.toString().toDouble()
            var taxaConversao :Double = 1.09

            var dolares :Double = euros*taxaConversao

            dolares= String.format("%.2f", dolares).toDouble()

            binding.textDollars.text = "$dolares Dolares"
        }
    }
}