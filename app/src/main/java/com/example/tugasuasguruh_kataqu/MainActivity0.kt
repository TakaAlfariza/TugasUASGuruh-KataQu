package com.example.tugasuasguruh_kataqu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.tugasuasguruh_kataqu.databinding.ActivityMainBinding
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import org.json.JSONObject

class MainActivity0 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main0)

        //ambil komponen dengan id
        val btnAllQuotes0 = findViewById<Button>(R.id.tombolnext)

        btnAllQuotes0.setOnClickListener({
            val nextPage = Intent(this, MainActivity::class.java)
            startActivity(nextPage)
            finish()
        })
    }
}