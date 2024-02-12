/*-----------------------------------------------------------------------
    PROJECT NAME    : n11-talenthub-cohorts-homework-01
    PACKAGE NAME    : Entity
    FILE            : House.java
    AUTHOR          : Mehmet Akif Tanisik
-----------------------------------------------------------------------*/

package entity;

import util.PropertyType;

public class House extends Property {

    public House() {
        super();
    }

    public House(int numberOfRooms, int numberOfLivingRooms, int totalLivingAreaInSquareMeters, double price) {
        super(numberOfRooms, numberOfLivingRooms, totalLivingAreaInSquareMeters, price);
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.HOUSE;
    }
}
