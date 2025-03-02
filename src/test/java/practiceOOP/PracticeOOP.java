package practiceOOP;

import org.testng.annotations.Test;

public class PracticeOOP {

    @Test
    public void metodaTest() {
        Tenis simonaHalep = new Tenis("Halep", "Simona", 30, "Tenis", 1, 20);
        simonaHalep.infoSportiv();

        System.out.println();

        Fotbalist dragusin = new Fotbalist("Dragușin", "Alex", 25, "Fotbal", "Romania", "Fundaș central");
        dragusin.infoSportiv();
    }
}
