package obiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {

    @Test
    public void metodaTest() {
        Masina Toyota = new Masina("Toyota","Corolla", 2024,"1600",40000);
        Toyota.detaliiMasina();

        System.out.println();

        Masina Dacia = new Masina("Dacia", "Duster",2020,"1600");
        Dacia.detaliiMasina();
    }
}
