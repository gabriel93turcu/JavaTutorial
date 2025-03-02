package oop;

import java.util.List;

public class RangeRover extends Masina {

    private List<String> dotariExterioare;

    public RangeRover(String marca, String model, String culoare, int an, List<String> dotariExterioare) {
        super(marca, model, culoare, an);
        this.dotariExterioare = dotariExterioare;
    }

    public RangeRover(String marca, String model, String culoare, int an, double pret, List<String> dotariExterioare) {
        super(marca, model, culoare, an, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void infoRangeRover() {
        infoMasina();
        System.out.println("Dotările exterioare sunt: " + dotariExterioare);
    }

    //polimorfism Dinamic
    public void pornesteMasina() {
        System.out.println("Mașinile Range Rover pornesc prin voice commend.");
    }

    //Polimorfism static
    public void promotie() {
        System.out.println("Din păcate, nu avem promoții.");
    }

    public void promotie(int discount) {
        System.out.println("Vă putem aplica un discount de: "+ discount + "%");
    }

    public void promotie(String cupon) {
        System.out.println("Vom aplica următorul cupon: "+ cupon);
    }


    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
}
