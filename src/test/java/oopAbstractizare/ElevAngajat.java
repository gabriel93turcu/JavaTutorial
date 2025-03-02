package oopAbstractizare;

public class ElevAngajat extends Persoana implements Elev,Angajat{

    private String scoala;
    private int clasa;
    private String firma;
    private String experinta;
    private int salar;

    public ElevAngajat(String nume, String prenume, int varsta, String scoala,
                       int clasa, String firma, String experinta, int salar) {
        super(nume, prenume, varsta);
        this.scoala = scoala;
        this.clasa = clasa;
        this.firma = firma;
        this.experinta = experinta;
        this.salar = salar;
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
