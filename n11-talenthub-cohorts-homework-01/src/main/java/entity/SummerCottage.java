/*-----------------------------------------------------------------------
    PROJECT NAME    : n11-talenthub-cohorts-homework-01
    PACKAGE NAME    : Entity
    FILE            : SummerCottage.java
    AUTHOR          : Mehmet Akif Tanisik
-----------------------------------------------------------------------*/

package entity;

import util.PropertyType;

public class SummerCottage extends Property {

    public SummerCottage() {
        super();
    }

    public SummerCottage(int numberOfRooms, int numberOfLivingRooms, int totalLivingAreaInSquareMeters, double price) {
        super(numberOfRooms, numberOfLivingRooms, totalLivingAreaInSquareMeters, price);
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.SUMMER_COTTAGE;
    }
}
