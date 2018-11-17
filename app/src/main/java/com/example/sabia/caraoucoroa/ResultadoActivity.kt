package com.example.sabia.caraoucoroa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*
import kotlin.random.Random
import java.util.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        //Gerar Numero Aleatorio
        val numero = Random.nextInt(2)

        if(numero == 0){
            imag_resultado.setImageResource(R.drawable.moeda_cara)
        }else{
            imag_resultado.setImageResource(R.drawable.moeda_coroa)
        }


        button_voltar.setOnClickListener {
            finish()
            //val intent = Intent(applicationContext, MainActivity::class.java)
            //startActivity( intent)
        }
    }
}
