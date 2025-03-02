package obiectConstructor;

import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void testMethod() {
        Student Gabriel = new Student("Turcu","Gabriel",31,"Poli",4);
        Gabriel.prezentareStudent();

        System.out.println();

        Student Razvan = new Student("Jude", "Răzvan", 29, "Poli", 3);
        Razvan.prezentareStudent();

        System.out.println();

        Razvan.varsta = 39;
        Razvan.an = 3;
        Razvan.prezentareStudent();

        System.out.println();

        Student Alex = new Student("Dorha", "Alex", 30);
        Alex.prezentareStudent();

        System.out.println();

        Alex.varsta = 31;
        Alex.facultate = "Poli";
        Alex.an = 1;
        Alex.prezentareStudent();

        System.out.println();


    }
}
