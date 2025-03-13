package constant;

import org.testng.annotations.Test;

public class ConstantConcept {

    //constantă = conceptul prin care definim o proprietate care nu își mai modifică valoarea inițială (ex: credențiale)

    public final String nume = "Gabriel";

    @Test
    public void testMethod() {
        System.out.println(nume);

        //nume = "Bogdan";
        System.out.println(nume);
    }
}
