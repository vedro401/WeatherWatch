package com.vedro401.weatherwatch.RetrofitServic

import com.vedro401.weatherwatch.RetrofitServic.Models.WeatherPack
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable


interface OpenweathermapAPI{

    @GET("forecast?appid=7d0cccd7deb07a31b73af4334510b116")
    abstract fun getWeatherPackByCity(@Query("q") city: String, @Query("cnt") count: Int): Observable<WeatherPack>

}