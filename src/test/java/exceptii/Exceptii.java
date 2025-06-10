package exceptii;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptii {

    @Test
    public void testMethod() {
        tryCatchExample();
      //  noExceptionTrigger();
        tryCatchExampleLombok();

    }

    // try...catch (excepție care se activează în momentul în care apelăm o clasă)
    public void tryCatchExample() {
        File file = new File("orice");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally se execută indiferent dacă a intrat pe try sau catch.");
        }
    }

    // excepție care nu se activează în momentul apelării clasei
    public void noExceptionTrigger() {
        String[] colegi = new String[2];
        colegi[0] = "Andrei";
        colegi[1] = "Razvan";
        colegi[2] = "Alex";
        for (int index = 0; index < colegi.length; index++) {
            System.out.println(colegi[index]);
        }
    }

    // try...catch cu lombok, fără finally
   @SneakyThrows(FileNotFoundException.class)
    public void tryCatchExampleLombok() {
        File file = new File("orice");
        FileInputStream fileInputStream = new FileInputStream(file);
    }

}
