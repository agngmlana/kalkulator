package com.example.mykalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var edAngka1 : EditText
    lateinit var edAngka2 : EditText
    lateinit var btnTambah : Button
    lateinit var btnKurang : Button
    lateinit var btnKali : Button
    lateinit var btnBagi : Button
    lateinit var txHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisiasi variabel terhadap view
        edAngka1 = findViewById(R.id.edAngkaPertama)
        edAngka2 = findViewById(R.id.edAngkaKedua)
        btnTambah = findViewById(R.id.btnJumlah)
        btnKurang = findViewById(R.id.btnKurang)
        btnKali = findViewById(R.id.btnKali)
        btnBagi = findViewById(R.id.btnBagi)
        txHasil = findViewById(R.id.txHasil)
        // membuat event onClick pada Button
        btnTambah.setOnClickListener(this)
        btnKurang.setOnClickListener(this)
        btnKali.setOnClickListener(this)
        btnBagi.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v !=null) {
            val angka1= edAngka1.text.toString().trim()
            val angka2= edAngka2.text.toString().trim()
            if (angka1.isEmpty()) {
                edAngka1.error = "isi angka pertama"
            } else if (angka2.isEmpty()){
                edAngka2.error = "isi angka kedua"
            }else {
                if (v.id==R.id.btnJumlah) {
                    val hasil =angka1.toInt() + angka2.toInt()
                    txHasil.text = hasil.toString()
                }else if (v.id==R.id.btnKurang) {
                    val hasil =angka1.toInt() - angka2.toInt()
                    txHasil.text = hasil.toString()
                }else if (v.id==R.id.btnKali) {
                    val hasil =angka1.toInt() * angka2.toInt()
                    txHasil.text = hasil.toString()
                }else if (v.id==R.id.btnBagi) {
                    val hasil =angka1.toInt() / angka2.toInt()
                    txHasil.text = hasil.toString()
                }
            }
        }

    }
}