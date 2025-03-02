package tema.tema2;

import org.testng.annotations.Test;

import java.util.SortedMap;

public class StructuriTema2 {

    //Rezolvam urmatoarele cerinte:
    //1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
    //2. Afisam in consola primele 3 numere de la 1 la 3;
    //3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    //4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    //5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");
    //6. Afisam in consola doar numerele pare pana la 10 (utilizam "for");
    //7. Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    //8. Afisam in consola primele 3 numere dibizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    //9. Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;
    //10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;
    //11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;

    @Test
    public void testMethod() {
        //dispalyYes("Da");
        //firstThreeNum(3);
        //compareNum(15,20);
        //compareNumDecimal(4.5,3.25);
        //evenOdsNum(10);
        //evenNumOnly(10);
        //divisibleBy5(30);
        //firstThreeDivisibleBy5();
        //sumNum(235,10);
        //sumFirst10Num(10);
        muliplicationNum(5);
        muliplicationNum(6);

    }

    //1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
    public void dispalyYes(String word) {
        for (int index = 0; index < 5; index ++){
            System.out.print(word+ ' ');
        }
    }

    //2. Afisam in consola primele 3 numere de la 1 la 3;
    public void firstThreeNum(int capat) {
        for (int index = 1; index<=capat; index++) {
            System.out.println(index);
        }
    }

    //3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa
    // nu harcodam valoarea in metoda;
    public void compareNum(int nr1, int nr2) {
        if(nr1>nr2){
            System.out.println("Numarul mai mare este: "+ nr1);
        } else if (nr1 ==nr2){
            System.out.println("Numerele sunt egale.");
        } else {
            System.out.println("Numarul mai mare este: "+ nr2);
        }
    }


    //4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25;
    // Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void compareNumDecimal(double nr1, double nr2) {
        if(nr1<nr2){
            System.out.println("Numarul mai mic este: "+ nr1);
        } else if (nr1 == nr2){
            System.out.println("Numerele sunt egale.");
        } else {
            System.out.println("Numarul mai mic este: "+ nr2);
        }
    }

    //5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");

    public void evenOdsNum(int capat) {
        for (int index = 0; index<=capat; index++) {
            if (index%2==0){
                System.out.println("Este numar par: "+index);
            } else {
                System.out.println("Este numar impar: "+ index);
            }
        }

    }

    //6. Afisam in consola doar numerele pare pana la 10 (utilizam "for");
    public void evenNumOnly(int capat) {
        for (int index = 0; index <= capat; index++) {
            if (index%2==0){
                System.out.println("Este numar par: "+index);
            }
        }
    }



    //7. Afisam in consola numerele divizibile cu 5;
    // Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void divisibleBy5(int number){
        for (int index = 0; index <= number; index++) {
            if (index%5==0){
                System.out.println(index + " este numar divizibil cu 5.");
            }
        }
    }


    //8. Afisam in consola primele 3 numere dibizibile cu 5;
    // Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void firstThreeDivisibleBy5(){
        int count = 0;
        int index = 0;
            while (count < 3){
                if (index%5==0){
                    System.out.println(index + " este numar divizibil cu 5.");
                    count++;
                }
                index++;
            }
        }

    //9. Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;
    public void sumNum(int a, int b) {
        int sum = a + b;
        System.out.println("Suma numerelor este: " + sum);
    }


    //10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;
    public void sumFirst10Num(int number) {
        int sum = 0;
        for (int index = 0; index <= number; index++){
            sum += index;
        }
        System.out.println("Suma numerelor este: " + sum);
    }


    //11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;
    public void muliplicationNum(int number) {
        int mul = 1;
        for (int index = 1; index <= number; index++){
            mul *= index;
        }
        System.out.println("Produsul numerelor este: " + mul);
    }

}
