package com.ananya.marvelapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Marveladapter
import com.marvelchar


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler)
        val list = ArrayList<marvelchar>()
        list.add(marvelchar(R.drawable.wanda, charname = "WANDA MAXIMOFF"))
        list.add(marvelchar(R.drawable.bp, charname = "BLACK PANTHER"))
        list.add(marvelchar(R.drawable.deadpool, charname = "DEADPOOL"))
        list.add(marvelchar(R.drawable.doctorstrange, charname = "DOCTOR STRANGE"))
        list.add(marvelchar(R.drawable.hawk, charname = "HAWKEYE"))
        list.add(marvelchar(R.drawable.hulk, charname = "HULK"))
        list.add(marvelchar(R.drawable.iron, charname = "IRON MAN"))
        list.add(marvelchar(R.drawable.natasha, charname = "NATASHA ROMANOFF"))
        list.add(marvelchar(R.drawable.sl, charname = "STARLIGHT LORD"))
        list.add(marvelchar(R.drawable.vision, charname = "VISION"))

        val adapter = Marveladapter(list, context = this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
    }
}