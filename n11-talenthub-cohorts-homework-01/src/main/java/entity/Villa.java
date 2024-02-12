/*-----------------------------------------------------------------------
    PROJECT NAME    : n11-talenthub-cohorts-homework-01
    PACKAGE NAME    : Entity
    FILE            : Villa.java
    AUTHOR          : Mehmet Akif Tanisik
-----------------------------------------------------------------------*/

package entity;

import util.PropertyType;

public class Villa extends Property {

    public Villa() {
        super();
    }

    public Villa(int numberOfRooms, int numberOfLivingRooms, int totalLivingAreaInSquareMeters, double price) {
        super(numberOfRooms, numberOfLivingRooms, totalLivingAreaInSquareMeters, price);
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.VILLA;
    }
}
