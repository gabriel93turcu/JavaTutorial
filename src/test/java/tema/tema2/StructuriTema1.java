package tema.tema2;

import org.testng.annotations.Test;

public class StructuriTema1 {

    //Tema 1
    //
    //Afiseaza pe ecran urmatoarele:
    //PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI
    //
    //1. Hello World
    //2. Varsta ta (numar)
    //3. Numele si prenumele pe 2 randuri
    //4. Adauga la "Salut" caracterul "M" la final
    //5. Adauga la "Hello" caracterul "H" la inceput
    //6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"
    //7. Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"
    //8. Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;
    //9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
    //10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;
    //
    //
    //! BONUS !
    //Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?
    //  Rezultatul corect este: {rezultatul}

    public String sentence;
    public int salary;


    @Test
    public void testMethod() {

        sentence = " Poti pleca acasa dupa ce iti verific munca!";

        helloWorld("Hello World" + sentence);
        myAge("31" + sentence);
        personName("Gabriel", "Turcu" + sentence);
        concatHi("Salut", "M" + sentence);
        concatHello("S", "Hello" + sentence);

        changeSentence();
        showSalary("Vlad");
        showSalary("Andrei");
        idEmployee("Popescu");
        idEmployee("Pop");
        departmentNuber(250);
        departmentNuber(300);
        calculateEcuation();



    }

    // 1
    public void helloWorld(String hello) {
        System.out.println(hello);
    }

    // 2
    public void myAge(String age) {
        System.out.println("My age is: " + age);
    }

    // 3
    public void personName(String firstName, String lastName) {
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
    }

    // 4
    public void concatHi(String hi, String param) {
        System.out.println(hi + param);
    }

    // 5
    public void concatHello(String param, String hello) {
        System.out.println(param + hello);
    }

    //6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"

    public void changeSentence() {
        String initialSentence = "Ana are mere,pere,prune";
        char letter = 'Z';

        System.out.println("Ana"+letter + " are"+letter + " mere"+letter+","+"pere"+letter+","+"prune"+letter);
    }



    // 7. Declare and added variable sentence



    // 8.

    public void showSalary(String name) {
        salary = 10000;
        if (name == "Andrei") {
            System.out.println("Salariul lui Andrei este: " + salary);
        }
    }


    // 9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"

    public void idEmployee(String name) {
        if (name == "Popescu") {
            System.out.println("ID = 1, Departament QA");
        }
    }

    //10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;

    public void departmentNuber(int number) {
        if(number > 287){
            System.out.println("Departamentul are mai mult de 287 de membri.");
        }
    }

    //! BONUS !
    //Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?
    //  Rezultatul corect este: {rezultatul}

    public void calculateEcuation() {
        double result = (2 + (3*4) - 3)/ 3.0;

        System.out.println("Rezultatul ecuației este: " + result);
    }

}



