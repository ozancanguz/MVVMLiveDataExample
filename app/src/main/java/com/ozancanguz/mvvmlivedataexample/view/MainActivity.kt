package com.ozancanguz.mvvmlivedataexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import com.ozancanguz.mvvmlivedataexample.R
import com.ozancanguz.mvvmlivedataexample.databinding.ActivityMainBinding
import com.ozancanguz.mvvmlivedataexample.viewmodel.CityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // init view model
    private val model:CityViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // model -data and business logic
        // view - activities-fragments
        // viewmodel-connection between layers that provides lc management

        fun onResume(){
            model.getCityData().observe(this, Observer { city->

              binding.cityImage.setImageDrawable(

                  ResourcesCompat.getDrawable(resources,city.img,applicationContext.theme)

              )

              binding.data.text=city.name
                binding.populationText.text=city.population.toString()

          })
       }
    }






}