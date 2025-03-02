package tema.tema1;

import org.testng.annotations.Test;

public class Housing {
    // 10 properties with different data. Properties:
    // type (String), numberOfRooms(int), hasAFloor (boolean)
    // surface (double), numberOfBathrooms (int), bedroomSurface (float)
    // price (int), hasGarage (boolean), energyClass (char), orientation (String)

    public String type;
    public int numberOfRooms;
    public boolean hasFloor;
    public double surface;
    public int numberOfBathrooms;
    public float bedroomSurface;
    public int price;
    public boolean hasGarage;
    public char energyClass;
    public String orientation;

    @Test
    public void housingPresentation() {
        type = "house";
        numberOfRooms = 4;
        hasFloor = false;
        surface = 120.15;
        numberOfBathrooms = 2;
        bedroomSurface = 21.12f;
        price = 120000;
        hasGarage = true;
        energyClass = 'A';
        orientation = "S-E";

        System.out.println("Type of housing: " + type);
        System.out.println("Number of rooms: " + numberOfRooms);
        System.out.println("Has a floor? " + hasFloor);
        System.out.println("Surface of house is(m^2): " + surface);
        System.out.println("Number of bathrooms: " + numberOfBathrooms);
        System.out.println("Bedroom surface is(m^2): " + bedroomSurface);
        System.out.println("Price of house is(€): " + price);
        System.out.println("Has a garage? " + hasGarage);
        System.out.println("Energy class is: " + energyClass);
        System.out.println("Orientation is: " + orientation);
    }

}
