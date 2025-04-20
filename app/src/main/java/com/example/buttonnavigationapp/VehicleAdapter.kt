package com.example.buttonnavigationapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class VehicleAdapter(private val context: Context, private val dataList: List<Vehicle>) : BaseAdapter() {
    override fun getCount(): Int = dataList.size
    override fun getItem(position: Int): Any = dataList[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item_vehicle, parent, false)

        val vehicle = dataList[position]

        val textManufacturer = view.findViewById<TextView>(R.id.text_manufacturer)
        val textYear = view.findViewById<TextView>(R.id.text_year)
        val textCountry = view.findViewById<TextView>(R.id.text_country)

        textManufacturer.text = vehicle.manufacturer
        textYear.text = vehicle.year.toString()
        textCountry.text = vehicle.country

        return view
    }
}

