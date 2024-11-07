package com.example.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.first_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }


  /*
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            var nome: String = binding.editNome.text.toString()
            binding.textResultado.text = "Olá $nome"
        }
    }
    */

/*
  TODO   * EXERCICIO:2 */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener{

            var primeiroNome: String = binding.editPrimeiroNome.text.toString() //Transformar primeiro nome de texto para string
            var segundoNome: String = binding.editSegundoNome.text.toString()   //Transformar segundo nome de texto para string

            if (primeiroNome.isEmpty() || segundoNome.isEmpty()){ // if (primeiroNome == null || segundoNome == null)
            // Vazio apresenta erro
                binding.textResultado.text="Não foi inserido nome e/ou apelido"
            }else{  // Apresenta o resultado
                //binding.textResultado.text = "Olá " + primeiroNome + " " + segundoNome + "!!"
                binding.textResultado.text = "Olá  $primeiroNome $segundoNome"
            }


        }

    }
}