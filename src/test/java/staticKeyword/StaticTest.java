package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest{

    @Test
    public void testMethod() {
        Elev Gabriel = new Elev("Turcu", "Gabriel", 31);
        Gabriel.infoElev();
        System.out.println();

        Elev Adrian = new Elev("Turcu", "Adrian", 31);
        Adrian.infoElev();
        System.out.println();

        System.out.println(Elev.getScoala());
    }
}
