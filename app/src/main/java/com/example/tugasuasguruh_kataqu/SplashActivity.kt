package com.example.tugasuasguruh_kataqu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    //Deklarasi variabel timer splash screen muncul
    private val SPLASH_TIME_OUT:Long = 3000 //delay 3 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Kode untuk menjalankan main screen setelah timer splash screen habis
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity0::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}