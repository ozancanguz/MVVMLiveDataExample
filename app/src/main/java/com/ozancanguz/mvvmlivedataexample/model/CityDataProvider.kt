package com.ozancanguz.mvvmlivedataexample.model

import com.ozancanguz.mvvmlivedataexample.R

class CityDataProvider {

    private val cities= arrayListOf<City>()

    init {
        var rome=City("Rome", R.drawable.rome,10000)
        var berlin=City("Paris", R.drawable.paris,2302)
        var tokyo=City("Tokyo", R.drawable.tokyo,1991)
        var paris=City("Rome", R.drawable.paris,1032)

        cities.add(rome)
        cities.add(berlin)
        cities.add(tokyo)
        cities.add(paris)


    }
    fun getCities()=cities
}