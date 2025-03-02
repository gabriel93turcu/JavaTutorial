package abstractizareRestaurant;

public class Restaurant {

    private String nume;
    private String adresa;
    private String program;

    public Restaurant(String nume, String adresa, String program) {
        this.nume = nume;
        this.adresa = adresa;
        this.program = program;
    }

    public void infoRestaurant() {
        System.out.println("Numele restaurnatului este: " + nume);
        System.out.println("Adresa restaurnatului este: " + adresa);
        System.out.println("Brandul restaurnatului este: " + program);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
