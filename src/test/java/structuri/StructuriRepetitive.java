package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //structurile repetitive: for, while

    @Test
    public void metodaTest() {
        // afisareNrFor(50);
        // afisareNrForDesc(50);

        //afisamNrPare();
       // afisamNrPareV2();
        afisareNrWhile(10);
    }

    //afișăm primele n numere
    public void afisareNrFor(int capat) {
        for (int index = 0; index <= capat; index++) {
            System.out.println("Numărul afișat este: " + index);
        }
    }

    //afișăm nr while
    public void afisareNrWhile(int capat) {
        int index = 0;
        while (index <= capat) {
            System.out.println("Numărul afișat este: " + index);
            index++;
        }
    }


    public void afisareNrForDesc(int capat) {
        for (int index = capat; index >= 0; index--) {
            System.out.println("Numărul afișat este: " + index);
        }
    }

    //afișăm numerele pare de la 0 la 50
    public void afisamNrPare() {
        for (int index = 0; index <= 50; index = index + 2) {
            System.out.println("Numarul par este: " + index);
        }
    }

    public void afisamNrPareV2() {
        for (int index = 0; index <= 50; index++) {
            if (index % 2 == 0) {
                System.out.println("Numarul par este: " + index);
            }
        }
    }

}
