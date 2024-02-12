/*-----------------------------------------------------------------------
    PROJECT NAME    : n11-talenthub-cohorts-homework-01
    PACKAGE NAME    : Property
    FILE            : Property.java
    AUTHOR          : Mehmet Akif Tanisik
-----------------------------------------------------------------------*/
package entity;

import util.PropertyType;

public abstract class Property {
    private int numberOfRooms;
    private int numberOfLivingRooms;
    private int totalLivingAreaInSquareMeters;
    private double price;

    protected Property() {
        this.numberOfRooms = 0;
        this.numberOfLivingRooms = 0;
        this.totalLivingAreaInSquareMeters = 0;
        this.price = 0;
    }

    protected Property(int numberOfRooms, int numberOfLivingRooms, int totalLivingAreaInSquareMeters, double price) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
        this.totalLivingAreaInSquareMeters = totalLivingAreaInSquareMeters;
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    public void setNumberOfLivingRooms(int numberOfLivingRooms) {
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalLivingAreaInSquareMeters() {
        return totalLivingAreaInSquareMeters;
    }

    public void setTotalLivingAreaInSquareMeters(int totalLivingAreaInSquareMeters) {
        this.totalLivingAreaInSquareMeters = totalLivingAreaInSquareMeters;
    }

    public abstract PropertyType getPropertyType();

    @Override
    public String toString() {
        return getPropertyType() + "{" + "numberOfRooms=" + numberOfRooms + ", numberOfLivingRooms=" + numberOfLivingRooms + ", totalLivingAreaInSquareMeters=" + totalLivingAreaInSquareMeters + ", price=" + price + '}';
    }
}
