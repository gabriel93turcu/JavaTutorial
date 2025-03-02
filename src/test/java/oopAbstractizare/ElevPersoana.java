package oopAbstractizare;

public class ElevPersoana extends Persoana implements Elev {

    private String scoala;
    private int clasa;

    public ElevPersoana(String nume, String prenume, int varsta, String scoala, int clasa) {
        super(nume, prenume, varsta);
        this.scoala = scoala;
        this.clasa = clasa;
    }

    public void infoElev() {
        infoPersoana();
        System.out.println("Scoala la care merge elevul este: " + scoala);
        System.out.println("Clasa în care este elevul este: " + clasa);
    }

    public String getScoala() {
        return scoala;
    }

    public void setScoala(String scoala) {
        this.scoala = scoala;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }


    @Override
    public void mergeLaScoala() {

    }

    @Override
    public void isiFaceTemele() {

    }

    @Override
    public void mergeInPauza() {

    }
}
