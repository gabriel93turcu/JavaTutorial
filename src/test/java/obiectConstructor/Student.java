package obiectConstructor;

public class Student {
    // constructor = are ca rol să inițializeze variabilele unei clase
    // într-o clasă, recunoaștem un constructor ca fiind o metodă publică care are exact același nume cu clasa
    // pentru moment, un constructor este public (poate să fie și privat - singletone)
    // într-o clasă putem avea mai mulți constructori diferențiați prin numărul sau tipul de parametrii
    // există 2 tipuri de constructori: Default (este în fiecare clasă fără să-l definim noi), cu Parametrii
    // dacă avem un parametru în constructor, care are același nume cu o variabilă din clasă => le inițializăm folosind this

    // obiect = instanța unei clase
    // dintr-o clasă putem defini o mulțime de obiecte
    // aceste obiecte se diferențiază prin numele lor
    // în momentul când se inițializează un obiect, se apelează constructorul din clasa acestuia
    // un obiect se inițializează prin folosirea lui new
    // în momentul când se crează un obiect, se alocă un spațiu dedicat în memorie pentru acesta care are structura clasei
    // un obiect, poate suferi modificări după inițializare. Se pot adăuga parametrii suplimentari la obiect în baza variabilelor declarate în clasă.


    public String nume;
    public String prenume;
    public int varsta;
    public String facultate;
    public int an;

    public Student(String nume, String prenume, int varsta, String facultate, int an) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.facultate = facultate;
        this.an = an;
    }

    public Student(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void prezentareStudent() {
        System.out.println("Numele studentului este: " + nume);
        System.out.println("Prenumele studentului este: " + prenume);
        System.out.println("Varsta studentului este: " + varsta);

        if(varsta > 35) {
            System.out.println("Studentul nu se mai poate înscrie la facultate.");
        } else if (facultate != null) {
            System.out.println("Facultatea studentului este: " + facultate);
            System.out.println("Studentul este în anul: " + an);
        }


    }
}
