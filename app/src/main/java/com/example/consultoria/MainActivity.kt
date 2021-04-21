package com.example.consultoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* evento de clique no  botao abaixo, executando os for programado */

        btnCliente.setOnClickListener{
                ///Toas exibe uma pequena mensagem dixendo que determinad ação foi tomada
             Toast.makeText(applicationContext,"Botão foi clicado", Toast.LENGTH_SHORT).show()

            // Start abaixo com uma intenção de abrir uma outra janela do app
         startActivity(Intent(this,detalhesClientes::class.java))
        }

        btnEmpresa.setOnClickListener{
            startActivity(Intent(this,detalheEmpresa::class.java))
        }

        btnContato.setOnClickListener{
            startActivity(Intent(this,contato::class.java))
        }

        btnServico.setOnClickListener{
            startActivity(Intent(this,servico::class.java))
        }
    }

}