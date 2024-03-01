package com.matnsk.weatherapi.service;

import com.matnsk.weatherapi.entity.Range;
import com.matnsk.weatherapi.entity.WeatherInfo;

/**
 * @author Mehmet Akif Tanisik
 */
public interface WeatherService {
    WeatherInfo getWeatherInfo(String city,String country,Range range);
}
