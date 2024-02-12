/*-----------------------------------------------------------------------
    PROJECT NAME    : n11-talenthub-cohorts-homework-01
    PACKAGE NAME    : Service
    FILE            : PropertyServiceImpl.java
    AUTHOR          : Mehmet Akif Tanisik
-----------------------------------------------------------------------*/

package service;

import entity.Property;
import util.PropertyType;

import java.util.ArrayList;
import java.util.List;

public class PropertyServiceImpl implements PropertyService {
    private final List<Property> propertyList;

    public PropertyServiceImpl(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    @Override
    public double getTotalPriceOfPropertiesByType(PropertyType propertyType) {
        double totalPrice = 0;
        for (Property property : propertyList) {
            if (propertyType == null || property.getPropertyType() == propertyType) {
                totalPrice += property.getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public double getTotalPriceOfAllProperties() {

        double price = 0;

        for (PropertyType propertyType : PropertyType.values()) {
            price += getTotalPriceOfPropertiesByType(propertyType);
        }

        return price;
    }

    @Override
    public double getAverageSquareMetersOfPropertiesByType(PropertyType propertyType) {
        double totalSquareMeters = 0;
        int propertyCount = 0;

        for (Property property : propertyList) {
            if (propertyType == null || property.getPropertyType() == propertyType) {
                totalSquareMeters += property.getTotalLivingAreaInSquareMeters();
                propertyCount++;
            }
        }

        return propertyCount > 0 ? totalSquareMeters / propertyCount : 0;
    }

    @Override
    public double getAverageSquareMetersOfAllProperties() {
        double totalSquareMeters = 0;
        int propertyCount = 0;

        for (PropertyType propertyType : PropertyType.values()) {
            totalSquareMeters += getAverageSquareMetersOfPropertiesByType(propertyType);
            propertyCount++;
        }

        return propertyCount > 0 ? totalSquareMeters / propertyCount : 0;
    }

    @Override
    public List<Property> filterPropertiesByRoomAndLivingRoom(int numberOfRooms, int numberOfLivingRooms, PropertyType propertyType) {
        List<Property> filteredHouses = new ArrayList<>();
        for (Property property : propertyList) {
            if (property.getPropertyType() == propertyType &&
                    property.getNumberOfRooms() == numberOfRooms &&
                    property.getNumberOfLivingRooms() == numberOfLivingRooms) {
                filteredHouses.add(property);
            }
        }
        return filteredHouses;
    }


}
