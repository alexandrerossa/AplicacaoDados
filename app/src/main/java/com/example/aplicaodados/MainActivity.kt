package com.example.aplicaodados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonSalvar = findViewById<Button>(R.id.buttonSalvar)
        buttonSalvar.setOnClickListener { MostraDados() }
    }

    private fun MostraDados() {

        val editTextNome = findViewById<EditText>(R.id.editTextNome)
        val editTextTelefone = findViewById<EditText>(R.id.editTextTelefone)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextAltura = findViewById<EditText>(R.id.editTextAltura)
        val editTextPeso = findViewById<EditText>(R.id.editTextPeso)

        val nome = editTextNome.text.toString()
        val telefone = editTextTelefone.text.toString()
        val email = editTextEmail.text.toString()
        val altura = editTextAltura.text.toString()
        val peso = editTextPeso.text.toString()


    }
}