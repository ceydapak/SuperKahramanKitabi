package com.example.superkahramankitabi

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val secilenKahramanismi=intent.getStringExtra("isim")
        textView.text = secilenKahramanismi

        var SecilenGorsel = intent.getIntExtra("gorsel",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,SecilenGorsel)
        imageView.setImageBitmap(bitmap)

       /* val secilenKahrmn = SingletonClass.SecilenHero
        val secilenGorsel = secilenKahrmn.grsel
        imageView.setImageBitmap(secilenGorsel)*/
    }
}