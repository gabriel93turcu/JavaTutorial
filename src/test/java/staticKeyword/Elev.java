package staticKeyword;

public class Elev {
    //Static = modalitate prin care setăm o valoare pe care să o accesăm în toate instanțele clasei
    //un alt scop este de a accesa o resursă fără să fie nevoie să definim un obiect
    //se păstrează valoarea proprității pentru toate obiectele

    private String nume;
    private String prenume;
    private int varsta;
    private static String scoala = "IT";

    public Elev(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoElev() {
        System.out.println("Numele și prenumele elevului sunt: " + nume + ' ' + prenume);
        System.out.println("Vârsta elevului este: " + varsta);
        System.out.println("Școala elevului este: " + scoala);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public static String getScoala() {
        return scoala;
    }
}
