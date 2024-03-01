package com.matnsk.weatherapi.service;

import com.matnsk.weatherapi.client.WeatherClient;
import com.matnsk.weatherapi.dto.Weather;
import com.matnsk.weatherapi.entity.Range;
import com.matnsk.weatherapi.entity.WeatherInfo;
import com.matnsk.weatherapi.exception.WeatherInfoAccessException;
import com.matnsk.weatherapi.mapper.WeatherInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * @author Mehmet Akif Tanisik
 */
@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService{

    private final WeatherClient weatherClient;
    private final WeatherInfoMapper weatherInfoMapper;
    @Override
    public WeatherInfo getWeatherInfo(String city, String country, Range range) {

        StringBuilder builder = new StringBuilder();

        try {
            LocalDate startDate = LocalDate.now();
            builder.append(startDate);
            if (range.equals(Range.WEEKLY)){
                builder.append("/").append(startDate.plusDays(6));
            }

            ResponseEntity<Weather> weather = weatherClient.getData(city, country, String.valueOf(builder));

            return weatherInfoMapper.convert(weather.getBody());

        } catch (Exception e) {
            throw new WeatherInfoAccessException("Unexpected error occurred while accessing weather info!");
        }
    }
}
