package com.example.aplicaodados

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MostrarDadosActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostradados)

        val TextViewNome = findViewById<TextView>(R.id.textViewNome)
        val TextViewTelefone = findViewById<TextView>(R.id.textViewTelefone)
        val TextViewEmail = findViewById<TextView>(R.id.textViewEmail)
        val TextViewAltura = findViewById<TextView>(R.id.textViewAltura)
        val TextViewPeso = findViewById<TextView>(R.id.textViewPeso)

        val nome = intent.getStringExtra("name")
        val telefone = intent.getStringExtra("phone")
        val email = intent.getStringExtra("email")
        val altura = intent.getStringExtra("height")
        val peso = intent.getStringExtra("weight")

        TextViewNome.text = "Nome: $nome"
        TextViewTelefone.text = "Telefone: $telefone"
        TextViewEmail.text = "Email: $email"
        TextViewAltura.text = "Altura: $altura"
        TextViewPeso.text = "Peso: $peso"


    }
}