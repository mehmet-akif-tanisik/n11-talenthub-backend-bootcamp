/*-----------------------------------------------------------------------
    PROJECT NAME    : n11-talenthub-cohorts-homework-01
    PACKAGE NAME    : PACKAGE_NAME
    FILE            : App.java
    AUTHOR          : Mehmet Akif Tanisik
-----------------------------------------------------------------------*/

import entity.Property;
import service.PropertyService;
import service.PropertyServiceImpl;
import util.LoadMockPropertyData;
import util.PropertyType;

import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Property> propertyList = LoadMockPropertyData.getPropertyList();

        PropertyService propertyService = new PropertyServiceImpl(propertyList);

        System.out.println("List of property information that has been saved in system: ");
        propertyList.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("Total price of all houses out of all properties in the system: %.2f%n", propertyService.getTotalPriceOfPropertiesByType(PropertyType.HOUSE));
        System.out.printf("Total price of all villas out of all properties in the system: %.2f%n", propertyService.getTotalPriceOfPropertiesByType(PropertyType.VILLA));
        System.out.printf("Total price of all summer cottages out of all properties in the system: %.2f%n", propertyService.getTotalPriceOfPropertiesByType(PropertyType.SUMMER_COTTAGE));
        System.out.printf("Total price of all types of properties in the system: %.2f%n", propertyService.getTotalPriceOfAllProperties());
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("Average living area in square meters of all houses out of all properties in the system: %.2f%n", propertyService.getAverageSquareMetersOfPropertiesByType(PropertyType.HOUSE));
        System.out.printf("Average living area in square meters of all villas out of all properties in the system: %.2f%n", propertyService.getAverageSquareMetersOfPropertiesByType(PropertyType.VILLA));
        System.out.printf("Average living area in square meters of all summer cottages out of all properties in the system: %.2f%n", propertyService.getAverageSquareMetersOfPropertiesByType(PropertyType.SUMMER_COTTAGE));
        System.out.printf("Average living area in square meters of all types of properties in the system: %.2f%n", propertyService.getAverageSquareMetersOfAllProperties());
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Filter properties by number of rooms and number of living rooms: 1 room, 1 living room, propertyType = HOUSE");
        List<Property> filteredHousesByRoomsAndLivingRoomNumber = propertyService.filterPropertiesByRoomAndLivingRoom(1,1,PropertyType.HOUSE);
        if (filteredHousesByRoomsAndLivingRoomNumber.isEmpty()){
            System.out.println("Could not find any property for this criteria!");
        } else {
            filteredHousesByRoomsAndLivingRoomNumber.forEach(System.out::println);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Filter properties by number of rooms and number of living rooms: 2 rooms, 1 living room, propertyType = VILLA");
        List<Property> filteredVillasByRoomsAndLivingRoomNumber = propertyService.filterPropertiesByRoomAndLivingRoom(2,1,PropertyType.VILLA);
        if (filteredVillasByRoomsAndLivingRoomNumber.isEmpty()){
            System.out.println("Could not find any property for this criteria!");
        } else {
            filteredVillasByRoomsAndLivingRoomNumber.forEach(System.out::println);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Filter properties by number of rooms and number of living rooms: 3 rooms, 1 living room, propertyType = SUMMER_COTTAGE");
        List<Property> filteredSummerCottagesByRoomsAndLivingRoomNumber = propertyService.filterPropertiesByRoomAndLivingRoom(3,1,PropertyType.SUMMER_COTTAGE);
        if (filteredSummerCottagesByRoomsAndLivingRoomNumber.isEmpty()){
            System.out.println("Could not find any property for this criteria!");
        } else {
            filteredSummerCottagesByRoomsAndLivingRoomNumber.forEach(System.out::println);
        }
    }
}
