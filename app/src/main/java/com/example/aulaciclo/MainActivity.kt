package com.example.aulaciclo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.i("cicloVida","onCreate")
        setContentView(R.layout.activity_main)

        var btnTelaCadastro:Button = findViewById(R.id.btnTelaCadastro)

        var modeloCarro : EditText = findViewById(R.id.editTxtModeloCar)


        //adicionar evento de clique

        btnTelaCadastro.setOnClickListener {

            var intent = Intent(this,TelaCadastro::class.java)

            //Enviando dados/paramtros para outra tela..

            //intent.putExtra("carro", "${modeloCarro.text}")
            //intent.putExtra("preco",45.799)

            var carro1 = Carro(
                "GM - Onix",
                2001
            )

            intent.putExtra("carro",carro1)

            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("cicloVida","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("cicloVida","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("cicloVida","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("cicloVida", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("cicloVida", "onDestry")
    }
}