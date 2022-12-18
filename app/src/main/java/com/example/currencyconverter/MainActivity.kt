package com.example.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.currencyconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val fromCountriesName = arrayOf("USD", "Pakistani rupee", "Iran rial", "Afghani",)
//    val toCountriesName = arrayOf("USD", "Pakistani rupee", "Iran rial", "Afghani",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, fromCountriesName)
//        val arrayAdapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, toCountriesName)

        binding.fromCountriesSpinner.adapter = arrayAdapter
//        binding.toCountriesSpinner.adapter = arrayAdapter2


        binding.fromCountriesSpinner.onItemSelectedListener = object :


            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                TODO("Not yet implemented")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
//        binding.toCountriesSpinner.onItemSelectedListener = object :
//            AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//        }
    }
}