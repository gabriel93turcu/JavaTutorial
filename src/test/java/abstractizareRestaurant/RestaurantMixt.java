package abstractizareRestaurant;

public class RestaurantMixt extends Restaurant implements Vegan, NonVegan {

    public RestaurantMixt(String nume, String adresa, String program) {
        super(nume, adresa, program);
    }

    @Override
    public void ingredienteNonVegan() {

    }

    @Override
    public void tipCarne() {

    }

    @Override
    public void tipPeste() {

    }

    @Override
    public void ingredienteVegane() {

    }

    @Override
    public void chelnerVegan() {

    }

    @Override
    public void bucatarVegan() {

    }
}
