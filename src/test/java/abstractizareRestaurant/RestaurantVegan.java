package abstractizareRestaurant;

public class RestaurantVegan extends Restaurant implements Vegan {

    public RestaurantVegan(String nume, String adresa, String program) {
        super(nume, adresa, program);
    }

    @Override
    public void ingredienteVegane() {
        System.out.println("Totate ingredientele sunt Vegane");
    }

    @Override
    public void chelnerVegan() {
        System.out.println("Toți chelnerii au experineță pentru restaurante vegane.");
    }

    @Override
    public void bucatarVegan() {
        System.out.println("Toți bucătarii au experineță pentru restaurante vegane.");
    }
}
