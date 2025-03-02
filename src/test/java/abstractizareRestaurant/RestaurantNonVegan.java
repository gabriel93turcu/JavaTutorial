package abstractizareRestaurant;

public class RestaurantNonVegan extends Restaurant implements NonVegan {
    public RestaurantNonVegan(String nume, String adresa, String program) {
        super(nume, adresa, program);
    }

    @Override
    public void ingredienteNonVegan() {
        System.out.println("Toate ingredientele sunt non vegane.");
    }

    @Override
    public void tipCarne() {
        System.out.println("Există mai multe tipuri de carne.");
    }

    @Override
    public void tipPeste() {
        System.out.println("Avem mai multe tipuri de pește.");
    }
}
