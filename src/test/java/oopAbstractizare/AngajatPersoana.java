package oopAbstractizare;

public class AngajatPersoana extends Persoana implements Angajat {

    private String firma;
    private String experinta;
    private int salar;

    public AngajatPersoana(String nume, String prenume, int varsta,
                           String firma, String experinta, int salar) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experinta = experinta;
        this.salar = salar;
    }

    public void infoAngajat() {
        infoPersoana();
        System.out.println("Firma la care lucrează angajatul este: " + firma);
        System.out.println("Experiența pe care o are angajatul este: " + experinta);
        System.out.println("Salarul angajatului este: " + salar);

    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getExperinta() {
        return experinta;
    }

    public void setExperinta(String experinta) {
        this.experinta = experinta;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    @Override
    public void mergeLaLucru() {

    }

    @Override
    public void primesteSalar() {

    }

    @Override
    public void pauzaDeMasa() {

    }

    @Override
    public void mergeInConcediu() {

    }
}