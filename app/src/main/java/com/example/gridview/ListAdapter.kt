package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(  context:  Context,val image:Array<Int>,val name:Array<String> ):
    BaseAdapter() {
    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return name.size
    }

    override fun getItem(position: Int): Any {
        return name[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.layoutadapter, parent, false)

        val textView: TextView
        val image1: ImageView
        textView = rowView.findViewById(R.id.textView)
        image1 = rowView.findViewById(R.id.imageView)
        textView.text = name[position]
        image1.setImageResource(image[position])


        return rowView
    }
}

