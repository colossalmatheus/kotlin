package com.example.aulaciclo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_cadastro)

        var txtResultado: TextView = findViewById(R.id.txtResultado)
        var bundle = intent.extras
//
//        var nomeCar = bundle?.getString("carro")
//        var precoCar = bundle?.getDouble("preco")

        var carro = bundle?.getSerializable("carro") as Carro
        txtResultado.text = "Modelo: ${carro.nome} - Preço: ${carro.anoFab}"

    }
}