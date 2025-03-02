package practiceOOP;

public class Sportiv {
    //definim mai departe proprietățiile unui sportiv pe care le customizăm în funcție de tipul sportului pe care îl practică

    private String nume;
    private String prenume;
    private int varsta;
    private String sport;


    public Sportiv(String nume, String prenume, int varsta, String sport) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sport = sport;
    }

    public void infoSportiv() {
        System.out.println("Numele sportivului este: " + nume + ' ' + prenume);
        System.out.println("Vârsta sportivului este: " + varsta);

        System.out.println("Sportul practicat este: " + sport);
      // System.out.println("Sportivul face parte din echipa: " + echipa);
       // System.out.println("Rolul sportivului este: " + rolulDinEchipa);





    }
}
