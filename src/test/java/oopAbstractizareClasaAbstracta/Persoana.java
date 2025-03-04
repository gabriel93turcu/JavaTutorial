package oopAbstractizareClasaAbstracta;

public abstract class Persoana {
    //o clasă abstractă se recunoaște după cuvântul ABSTRACT
    //clasa abstractă poate sau nu să conțină metode abstracte
    //o clasă abstractă se moștenește
    //clasa care moștenește o clasă abstractă trebuie să implementeze toate metodele abstracte
    //o metodă abstractă trebuie să mențină cuvântul ABSTRACT
    //metodele abstracte pot fi public/protected
    //o clasă abstractă poate să implementeze o interfață
    //o clasă abstractă poate să conțină un constructor => NU putem face un obiect dintr-o clasă abstractă

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public abstract void mergeLaLucru();

    public abstract void primesteSalar();

    public abstract void pauzaDeMasa();

    public abstract void mergeInConcediu();

    public abstract void faceCurat();

    public abstract void mergeLaCumparaturi();

    public abstract void mergeLaScoala();

    public abstract void isiFaceTemele();

    public abstract void mergeInPauza();

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

