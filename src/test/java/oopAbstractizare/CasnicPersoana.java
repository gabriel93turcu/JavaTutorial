package oopAbstractizare;

public class CasnicPersoana extends Persoana implements Casnic{

    public CasnicPersoana(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void faceCurat() {

    }

    @Override
    public void mergeLaCumparaturi() {

    }
}
