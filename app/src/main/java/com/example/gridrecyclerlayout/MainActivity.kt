package com.example.gridrecyclerlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gridrecyclerlayout.adapter.MyAdapter
import com.example.gridrecyclerlayout.model.GridData

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<GridData>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        charItem = ArrayList()
        charItem = setAlphas()
        alphaAdapters = MyAdapter(applicationContext, charItem!!)
        recyclerView?.adapter = alphaAdapters

    }

    private fun setAlphas(): ArrayList<GridData> {

        var arrayList: ArrayList<GridData> = ArrayList()

        arrayList.add(GridData(R.drawable.one, " Fantastic"))
        arrayList.add(GridData(R.drawable.two, " Amazing"))
        arrayList.add(GridData(R.drawable.three, " Beautiful"))
        arrayList.add(GridData(R.drawable.four, " Glamorous"))
        arrayList.add(GridData(R.drawable.five, " Amazing"))
        arrayList.add(GridData(R.drawable.six, " Charming"))
        arrayList.add(GridData(R.drawable.seven, " Gracious"))
        arrayList.add(GridData(R.drawable.eitgh, " Wonderful"))
        arrayList.add(GridData(R.drawable.nine, " Spectacular"))
        arrayList.add(GridData(R.drawable.ten, " Simple"))
        arrayList.add(GridData(R.drawable.eleven, " Gorgeous"))
        arrayList.add(GridData(R.drawable.twelve, " Distinguished"))
        arrayList.add(GridData(R.drawable.thirteen, " Magnificent"))
        arrayList.add(GridData(R.drawable.fourteen, " Blossom"))
        arrayList.add(GridData(R.drawable.fifteen, " Selected"))
        arrayList.add(GridData(R.drawable.sixteen, " Overwhelming"))
        arrayList.add(GridData(R.drawable.seventeen, " Heavenly"))
        arrayList.add(GridData(R.drawable.eighteen, " Immaculate"))
        arrayList.add(GridData(R.drawable.nineteen, " Unquestionable"))
        arrayList.add(GridData(R.drawable.teenty, " Blessed"))


        return arrayList
    }

}