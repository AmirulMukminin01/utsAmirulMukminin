package com.example.utspemmobile

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.utspemmobile.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val panjang = findViewById<EditText>(R.id.panjang)
        val lebar = findViewById<EditText>(R.id.lebar)
        val tinggi = findViewById<EditText>(R.id.tinggi)
        val result = findViewById<TextView>(R.id.result)
        val result1 = findViewById<TextView>(R.id.result1)


        binding.buttonHasil.setOnClickListener {
            val panjangB = panjang.text.toString()
            val lebarB = lebar.text.toString()
            val tinggiB = tinggi.text.toString()

            if (panjangB.isNotEmpty() && lebarB.isNotEmpty() && tinggiB.isNotEmpty()) {
                val n1 = panjangB.toInt()
                val n2 = lebarB.toInt()
                val n3 = tinggiB.toInt()

                val volume = n1 * n2 * n3
                val luas = 2 * (n1 * n2 + n1 * n3 + n2 * n3)


                result.text = "Volume Balok: $volume"
                result1.text = "Luas Balok: $luas"

            } else {
                result.text = "Harap masukkan semua inputan."
            }
        }
    }
}