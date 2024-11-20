package com.example.tajhotel

import android.os.Bundle
import android.widget.Adapter
import android.widget.SearchView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.lint.Name
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.util.query
import com.example.tajhotel.Adapter.RecipeAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager( LinearLayoutManager(this));
       val list = ArrayList<RecipeModel>();
        list.add(RecipeModel(R.drawable.f1, "burger"))
        list.add(RecipeModel(R.drawable.f2, "pizza"))
        list.add(RecipeModel(R.drawable.f3, "chowmain"))
        list.add(RecipeModel(R.drawable.f4, "roll"))
        list.add(RecipeModel(R.drawable.f5, "chilli potato"))
        list.add(RecipeModel(R.drawable.f6, "momo"))
        list.add(RecipeModel(R.drawable.f7, "paneer"))
        list.add(RecipeModel(R.drawable.f8, "egg curry"))
        list.add(RecipeModel(R.drawable.f9, "chicken"))
        list.add(RecipeModel(R.drawable.f10,"biryani"))
        list.add(RecipeModel(R.drawable.f11, "sandwich"))
        list.add(RecipeModel(R.drawable.f12, "chaat"))
        list.add(RecipeModel(R.drawable.f13, "fish"))
        list.add(RecipeModel(R.drawable.f14, "chhole bhature"))
        list.add(RecipeModel(R.drawable.f15, "pav bhaji"))
        list.add(RecipeModel(R.drawable.f16, "vada pav"))
        list.add(RecipeModel(R.drawable.f17, "mutton"))
        list.add(RecipeModel(R.drawable.f18, "tikki chaat"))
        list.add(RecipeModel(R.drawable.f19, "dosa"))
        list.add(RecipeModel(R.drawable.f20, "etli"))
      val Adapter= RecipeAdapter(list,this);
        recyclerView.adapter = Adapter

    }


    }

