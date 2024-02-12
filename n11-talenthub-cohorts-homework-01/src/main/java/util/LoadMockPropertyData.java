/*-----------------------------------------------------------------------
    PROJECT NAME    : N11 - Patika TalentHub Cohorts Homeworks
    PACKAGE NAME    : util
    FILE            : MockPropertyData.java
    AUTHOR          : Mehmet Akif Tanisik
-----------------------------------------------------------------------*/

package util;

import entity.House;
import entity.Property;
import entity.SummerCottage;
import entity.Villa;

import java.util.ArrayList;
import java.util.List;

public final class LoadMockPropertyData {

    private static final List<Property> PROPERTY_LIST = new ArrayList<>();

    static {
        loadMockPropertyData();
    }

    private LoadMockPropertyData() {
    }

    public static List<Property> getPropertyList() {
        return PROPERTY_LIST;
    }

    private static void loadMockPropertyData() {
        PROPERTY_LIST.add(new House(1, 1, 100, 12000));
        PROPERTY_LIST.add(new House(1, 1, 100, 10000));
        PROPERTY_LIST.add(new House(3, 3, 200, 7000));
        PROPERTY_LIST.add(new House(3, 3, 300, 18000));
        PROPERTY_LIST.add(new Villa(1, 1, 100, 6000));
        PROPERTY_LIST.add(new Villa(1, 1, 200, 10000));
        PROPERTY_LIST.add(new Villa(2, 1, 120, 15000));
        PROPERTY_LIST.add(new Villa(1, 1, 150, 13000));
        PROPERTY_LIST.add(new SummerCottage(1, 1, 200, 14000));
        PROPERTY_LIST.add(new SummerCottage(1, 1, 80, 8000));
        PROPERTY_LIST.add(new SummerCottage(1, 1, 90, 9000));
        PROPERTY_LIST.add(new SummerCottage(2, 2, 160, 10000));
    }


}
