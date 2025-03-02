package oop;

import org.testng.annotations.Test;

import java.util.Arrays;

public class OOPTest {

    @Test
    public void testMethod() {
        RangeRover gabrielSport = new RangeRover("Range Rover", "Sport",
                "Alb", 2024,Arrays.asList("Aer condiționat", "Geamuri electrice", "Oglinzi încălzite"));
        gabrielSport.infoRangeRover();
        gabrielSport.pornesteMasina();
        gabrielSport.promotie();


        System.out.println();

        RangeRover alexSport = new RangeRover("Range Rover", "Sport", "Alb", 2024,
                100,Arrays.asList("Aer condiționat", "Geamuri electrice", "Oglinzi încălzite"));
        alexSport.infoRangeRover();

        System.out.println();

        System.out.println(alexSport.getCuloare());
        System.out.println(alexSport.getPret());
        alexSport.setCuloare("Rosu");
        alexSport.infoRangeRover();
        alexSport.promotie(5);

        System.out.println();

        Audi gabrielA3 = new Audi("Audi", "A3", "Alb",2024,
                Arrays.asList("Aer condiționat", "Geamuri electrice", "Oglinzi încălzite"),
                Arrays.asList("Piele", "Mahon", "Cotieră"));
        gabrielA3.infoAudi();
        gabrielA3.pornesteMasina();

        System.out.println();

        Audi alexA3 = new Audi("Audi", "A3", "Alb",2024,200,
                Arrays.asList("Aer condiționat", "Geamuri electrice", "Oglinzi încălzite"),
                Arrays.asList("Piele", "Mahon", "Cotieră"));
        alexA3.infoAudi();


    }
}
