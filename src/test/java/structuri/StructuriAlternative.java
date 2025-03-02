package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //există 2 tipuri de structuri în programare: Alternative și repetitive
    //Structuri alternative: if...else, switch...case

    @Test
    public void metodaTest() {
    afisamNrMaiMare(10,14);
    afisamNrMaiMare(12,10);
    afisamNrMaiMare(10,10);

    verificamNrDivizibil5(10);
    verificamNrDivizibil5(11);

    afisamZieleSaptamanii(4);
    afisamZieleSaptamanii(10);

    }

    //afișăm numărul mai mare dintre 2 valori
    public void afisamNrMaiMare(int nr1, int nr2) {
        if (nr1 == nr2) {
            System.out.println("Numere sunt egale. ");
        } else if (nr1>nr2) {
            System.out.println("Numărul mai mare este: " + nr1);
        }
        else {
            System.out.println("Numărul mai mare este: " + nr2);
        }
    }

    //verificăm că un număr este divizibil cu 5
    public void verificamNrDivizibil5(int nr){
        if (nr%5==0){
            System.out.println("Numărul este divizibil cu 5.");
        }
    }

    //afișăm zilele săptămânii
    public void afisamZieleSaptamanii(int zi){
        switch (zi){
            case 1:
                System.out.println("Astăzi este Luni.");
                break;
            case 2:
                System.out.println("Astăzi este Marți.");
                break;
            case 3:
                System.out.println("Astăzi este Miercuri.");
                break;
            case 4:
                System.out.println("Astăzi este Joi.");
                break;
            case 5:
                System.out.println("Astăzi este Vineri.");
                break;
            case 6:
                System.out.println("Astăzi este Sâmbătă.");
                break;
            case 7:
                System.out.println("Astăzi este Duminică.");
                break;
            default:
                System.out.println("Nu este o zi existentă a săptămânii");

        }
    }

}
