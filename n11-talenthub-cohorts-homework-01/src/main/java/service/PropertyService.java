/*-----------------------------------------------------------------------
    PROJECT NAME    : n11-talenthub-cohorts-homework-01
    PACKAGE NAME    : Service
    FILE            : PropertyService.java
    AUTHOR          : Mehmet Akif Tanisik
-----------------------------------------------------------------------*/
package service;

import entity.Property;
import util.PropertyType;

import java.util.List;

public interface PropertyService {
    double getTotalPriceOfPropertiesByType(PropertyType propertyType);

    double getTotalPriceOfAllProperties();

    double getAverageSquareMetersOfPropertiesByType(PropertyType propertyType);

    double getAverageSquareMetersOfAllProperties();

    List<Property> filterPropertiesByRoomAndLivingRoom(int numberOfRooms, int numberOfLivingRooms, PropertyType propertyType);
}
