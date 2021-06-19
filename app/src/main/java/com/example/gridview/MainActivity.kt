package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    private var name= arrayOf<String>("cristiano Ronaldo","selena gomez","justin ","taylor","Vidya balan","Hennah Montana")
    private var image= arrayOf<Int>(R.drawable.cristain,R.drawable.selena,R.drawable.justin,R.drawable.taylor,R.drawable.vidyabalan,R.drawable.download)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridView=findViewById(R.id.gridView)
        title = "KotlinApp"
        gridView = findViewById(R.id.gridView)
        val mainAdapter = ListAdapter(this,image,name)
        gridView.adapter = mainAdapter

    }
}