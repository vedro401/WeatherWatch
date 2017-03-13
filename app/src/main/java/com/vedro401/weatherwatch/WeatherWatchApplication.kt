package com.vedro401.weatherwatch

import android.app.Application
import com.vedro401.weatherwatch.RetrofitServic.OpenweathermapAPI
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;



/**
 * Created by someone on 11.03.17.
 */

class WeatherWatchApplication: Application() {

    lateinit var openweathermapAPI: OpenweathermapAPI

    override fun onCreate() {
        super.onCreate()

        //TODO make it by dager
        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.openweathermap.org/data/2.5/")
                .build()
        val openweathermapAPI = retrofit.create(OpenweathermapAPI::class.java)
    }

    fun getOAPI() = openweathermapAPI
}
