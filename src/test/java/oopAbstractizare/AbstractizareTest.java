package oopAbstractizare;

import org.testng.annotations.Test;

public class AbstractizareTest {

    @Test
    public void metodaTest(){

        ElevPersoana Obiect1 = new ElevPersoana("Turcu", "Gabriel", 31, "UTCN", 2);
        Obiect1.infoElev();
        System.out.println();

        AngajatPersoana Obiect2 = new AngajatPersoana("Turcu", "Gabriel", 31,
                "Google", "5 ani", 5000);
        Obiect2.infoAngajat();
        System.out.println();

        ElevAngajat Obiect3 = new ElevAngajat("Turcu", "Gabriel", 31,
                "UTCN", 3,"Google","10 ani", 10000);
        Obiect3.infoPersoana();
        System.out.println();
    }
}
