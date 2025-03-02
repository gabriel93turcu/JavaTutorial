package oopAbstractizare;

public class Persoana {

    //Abstractizare = conceptul prin care putem definii comportamentul unei clase
    //abstractizarea se poate face în două feluri: folosind INTERFEȚE sau CLASE ABSTRACTE
    //o INTERFAȚĂ conține doar metode abstracte (motode care nu au body)
    //recunoaștem o Intefrață pe baza cuvântului INTERFACE
    //Toate metodele din Interfață sunt publice
    //o Interfață nu poate să conțină un contructor => nu putem face un obiect
    //o Interfață se IMPLEMENTEAZĂ
    //o Clasă poate să implementeze o interfață => Trebuie să implementeze toate metodele din Interfață
    //o Clasă poate implementa mai multe Interfețe
    //O Interfață poate exitinde o altă Interfață
    //o Clasă abstractă poate implementa o Interfață, însă o Intefață nu poate exinde o Clasă Abstractă

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Vârsta persoanei este: " + varsta);
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
}
