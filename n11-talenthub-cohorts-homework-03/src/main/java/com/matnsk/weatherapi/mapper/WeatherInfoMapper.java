package com.matnsk.weatherapi.mapper;

import com.matnsk.weatherapi.dto.Day;
import com.matnsk.weatherapi.entity.DayInfo;
import com.matnsk.weatherapi.entity.WeatherInfo;
import com.matnsk.weatherapi.dto.Weather;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * @author Mehmet Akif Tanisik
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface WeatherInfoMapper {


    WeatherInfo convert(Weather weather);
    List<DayInfo> convertToDayInfos(List<Day> days);


}
