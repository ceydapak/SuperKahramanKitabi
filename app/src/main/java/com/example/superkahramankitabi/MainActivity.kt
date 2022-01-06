package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var KahramanListesi = ArrayList<String>()
        KahramanListesi.add("SUPERMAN")
        KahramanListesi.add("SPIDERMAN")
        KahramanListesi.add("BATMAN")
      /*  //Verimsiz Tanımlamalar
        val superBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val spiBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        val batBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)

        var KahramanGorselleri= ArrayList<Bitmap>()
        KahramanGorselleri.add(superBitmap)
        KahramanGorselleri.add(spiBitmap)
        KahramanGorselleri.add(batBitmap)*/

        //Verimli tanımlamalar
        val superman = R.drawable.superman
        val spiderman= R.drawable.spiderman
        val batman = R.drawable.batman

        var superVerimliListe = ArrayList<Int>()
        superVerimliListe.add(superman)
        superVerimliListe.add(spiderman)
        superVerimliListe.add(batman)

        //Adapter
        val layoutmanager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutmanager
        val adptr = adapter(KahramanListesi, superVerimliListe)
        recyclerView.adapter = adptr




    }
}