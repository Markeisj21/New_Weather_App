package com.example.newweatherapp.domain.weather

import com.example.newweatherapp.data.remote.WeatherDataDto

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
