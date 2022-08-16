package com.example.rvdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.helper.widget.Carousel
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var FilmsArrayList:ArrayList<Films>
    private lateinit var adapter: FilmsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        val f1 = Films(1,"Django","django",12.99)
        val f2 = Films(2,"Anadolu  ","bir",9.99)
        val f3 = Films(3,"Inception","inception",13.99)
        val f4 = Films(4,"Insterstellar","interstellar",17.99)
        val f5 = Films(5,"The Hateful Eight","thehate",9.99)
        val f6 = Films(6,"The Pianist","pianist",14.99)

        FilmsArrayList = ArrayList<Films>()

        FilmsArrayList.add(f1)
        FilmsArrayList.add(f2)
        FilmsArrayList.add(f3)
        FilmsArrayList.add(f4)
        FilmsArrayList.add(f5)
        FilmsArrayList.add(f6)

        adapter = FilmsAdapter(this,FilmsArrayList)
        rv.adapter = adapter


    }
}