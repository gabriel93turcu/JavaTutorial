package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //clasa = șablon pe baza căruia putem defini un exemplu din viața reală
    //într-un fișier Java recunoaștem o clasă după cuvântul class
    //este obligatoriu pentru o clasă să aibă un nume
    //într-un fișier java putem avea mai multe clase diferențiate prin numele acestora
    //nu este un best practice să avem în java mai mult de o clasă într-un fișier
    //o clasă conține variabile și metode
    //variabilă = proprietatea unei clase
    //o variabilă poate sau nu să aibă o valoare
    //o variabilă își poate modifica valoarea
    //valoarea unei variabile se stabilește în funcție de tipul de dată
    //există 2 tipuri de variabile: globală și locală
    //o variabilă globală se definește specificând nivelul de vizibilitate(access control)
    //o variabilă globală este vizibilă peste tot în această clasă
    //o variabilă locală se definește specificând tipul de dată și un nume
    //o variabilă locală este vizibilă doar în locul în care am definit-o
    //metodă = acțiunea specifică unei clase
    //într-o clasă putem avea mai multe metode
    //există 2 tipuri de metode: void (vizibilă public) și return (vizibilă dacă se dorește)
    //recunoaștem o metodă după access control, tipul metodei, nume, (), {}
    //CMD+OPT+L - areanjează cod

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char gen;
    public boolean areRestante;

    @Test
    public void prezentareStudent() {
        nume = "Turcu";
        prenume = "Gabriel";
        varsta = 31;
        adresa = "Cuj, Florești, Avram Iancu 460e";
        inaltime = 1.73;
        greutate = 71.2f;
        gen = 'M';
        areRestante = false;

        System.out.println("Prezentarea studentului este: " + nume + ' ' + prenume + ' ' + varsta);
        System.out.println("Adresa studentului este: " + adresa);
        System.out.println("Înățimea studentului este: " + inaltime);
        System.out.println("Greutatea studentului este: " + greutate);
        System.out.println("Genul studentului este: " + gen);
        System.out.println("Studentul are restanțe? " + areRestante);

        calculMedie();
        calculMedie3note(6,7,8);
    }

    //Facem o metodă cu variabile locale

    public void calculMedie() {
        double nota1 = 10;
        double nota2 = 5;
        double medie = (nota1 + nota2) / 2;

        System.out.println("Media studentului este: " + medie);
    }

    public void calculMedie3note(double nota1, double nota2, double nota3) {
        double average = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media este: " + average);
        }
    }
