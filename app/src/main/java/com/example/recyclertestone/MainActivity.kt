package com.example.recyclertestone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclertestone.adapter.dataAdapter
import com.example.recyclertestone.model.Data
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dataArray=ArrayList<Data>()
        dataArray.add(Data("001",R.drawable.shoeone,"Erke Superfly 6 \nEliteFG","$699"))
        dataArray.add(Data("002",R.drawable.shoetwo,"Erke Superfly 6 \nEliteFG","$699"))
        dataArray.add(Data("003",R.drawable.shoeone,"Erke Superfly 6 \nEliteFG","$699"))
        dataArray.add(Data("004",R.drawable.shoetwo,"Erke Superfly 6 \nEliteFG","$699"))
        dataArray.add(Data("005",R.drawable.shoeone,"Erke Superfly 6 \nEliteFG","$699"))
        dataArray.add(Data("006",R.drawable.shoetwo,"Erke Superfly 6 \nEliteFG","$699"))
        dataArray.add(Data("007",R.drawable.shoeone,"Erke Superfly 6 \nEliteFG","$699"))
        var dataAdapter=dataAdapter(dataArray)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager= GridLayoutManager(this,2)
        recyclerView.adapter=dataAdapter
    }
}
