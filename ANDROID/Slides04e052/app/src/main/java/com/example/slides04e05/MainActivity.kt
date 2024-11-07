package com.example.slides04e05

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.slides04e05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    /* TODO   * EXERCICIO:1 e 2

         binding.buttonConverter.setOnClickListener{
               var euros: Double = binding.editTextEuros.text.toString().toDouble()
               var taxaConversao :Double = 1.09

               var dolares : Double = euros*taxaConversao

               dolares = String.format("%.2f",dolares).toDouble() // uma string com precisão de dois decimais

               binding.textValorDolares.text= "$dolares $"
           }
    */


    /*
    TODO   * EXERCICIO:3

       binding.buttonConversorDolar.setOnClickListener {
           var euros: Double = binding.editTextEuros.text.toString().toDouble()
           var taxaConversaoDol: Double = 1.20

           var dolares: Double = euros * taxaConversaoDol

           dolares = String.format("%.2f", dolares).toDouble()

           //  binding.textValorConvertido.text = "$dolares $"
           Toast.makeText(applicationContext, "$dolares $", Toast.LENGTH_SHORT).show()
       }

       binding.buttonConversorReal.setOnClickListener {
           var euros: Double = binding.editTextEuros.text.toString().toDouble()
           var taxaConversaoReal: Double = 4.4

           var reais: Double = euros * taxaConversaoReal

           reais = String.format("%.2f", reais).toDouble()

           //binding.textValorConvertido.text = "$reais R$"
           Toast.makeText(applicationContext, "$reais R$", Toast.LENGTH_SHORT).show()
       }

       binding.buttonConversorPeso.setOnClickListener {
           var euros: Double = binding.editTextEuros.text.toString().toDouble()
           var taxaConversaoPeso: Double = 31.5

           var peso: Double = euros*taxaConversaoPeso

           peso = String.format("%.2f", peso).toDouble()

         //  binding.textValorConvertido.text = "$ $peso COP"
           Toast.makeText(applicationContext, "$ $peso COP", Toast.LENGTH_SHORT).show()

       }
        */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {  // Ao clicar no botão da vista

            var username = binding.editTextUser.text.toString() //Transformar usuario inserido de texto para string
            var password = binding.editTextPass.text.toString() //Transformar password inserido de texto para string

            binding.editTextUser.setText("") // limpa os parâmetros
            binding.editTextPass.setText("")

            if (username.equals("user") && password.equals("pass")) {
                //Login Válido
                Toast.makeText(applicationContext, "Login Válido", Toast.LENGTH_SHORT).show()

                // Mudar de atividade(página)
                startActivity(Intent(this, MainActivity2::class.java))

            } else { //Login Inválido
                Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()
            }

                  }
    }
}