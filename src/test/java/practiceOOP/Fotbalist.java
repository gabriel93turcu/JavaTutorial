package practiceOOP;

public class Fotbalist extends Sportiv {
    private String echipa;
    private String rol;

    public Fotbalist(String nume, String prenume, int varsta, String sport, String echipa, String rol) {
        super(nume, prenume, varsta, sport);
        this.echipa = echipa;
        this.rol = rol;
    }

    public void infoSportiv() {
        super.infoSportiv();
        System.out.println("Face parte din echipa: "+echipa);
        System.out.println("Joacă pe poziția: " + rol);
    }
}
