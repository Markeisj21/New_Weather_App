package com.example.newweatherapp.domain.repository

import com.example.newweatherapp.domain.util.Resource
import com.example.newweatherapp.domain.weather.WeatherInfo


interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}