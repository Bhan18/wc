package com.example.worldcupwinners

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<info>
    private lateinit var images : Array<Int>
    private lateinit var teams : Array<String>
    private lateinit var years : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        images= arrayOf(
            R.drawable.wc1t,
            R.drawable.wc2t,
            R.drawable.wc3t,
            R.drawable.wc4t,
            R.drawable.wc5t,
            R.drawable.wc6t,
            R.drawable.wc7t,
            R.drawable.wc8t,
            R.drawable.wc9t,
            R.drawable.wc10t,
            R.drawable.wc11t,
            R.drawable.wc12t,
            R.drawable.wc13t
            )
        teams= arrayOf(
            "1975", "1979", "1983", "1987", "1992", "1996", "1999", "2003", "2007", "2011", "2015", "2019", "2023"
        )
        years= arrayOf(
            "West Indies", "West Indies", "India", "Australia", "Pakistan", "Sri Lanka", "Australia", "Australia", "Australia", "India", "Australia", "England", "Australia"
        )
        newRecyclerView= findViewById(R.id.recycle)
        newRecyclerView.layoutManager= LinearLayoutManager(this
        )
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<info>()
        getUserdata()
    }
    private fun getUserdata(){
        for (i in teams.indices){
            val info = info(images[i],teams[i], years[i])
            newArrayList.add(info)
        }
        Log.d("TAG", "getUserdata: $newArrayList")
        newRecyclerView.adapter= Myadapter(newArrayList)
    }
}
