package tema.tema1;

import org.testng.annotations.Test;

public class Masina {
    // 10 proprietăți cu diferite tipuri de date. Proprietăți:
    // marcă (string), model (string), anFabricatie (int),
    // capacitateCilindrica (int), combustibil (string), lungime (double),
    // greutate (float), transmisie (char), putere (string), esteÎnmatriculată (boolean)

    public String marca;
    public String model;
    public int anFabricatie;
    public int capacitateCilindrica;
    public String combustibil;
    public double lungime;
    public float greutate;
    public char transmisie;
    public String putere;
    public boolean esteInmatriculata;

    @Test
    public void caracteristiciMasina() {
        marca = "Toyota";
        model = "Corolla Sedan Dynamic HYB";
        anFabricatie = 2025;
        capacitateCilindrica = 1798;
        combustibil = "Hybrid";
        lungime = 4630.5;
        greutate = 1415.12f;
        transmisie = 'A';
        putere = "103 kW@rpm";
        esteInmatriculata = true;

        System.out.println("Marca mașinii este: " + marca);
        System.out.println("Modelul mașinii este: " + model);
        System.out.println("Anul fabricației mașinii este: " + anFabricatie);
        System.out.println("Capacitatea cilindrică a mașinii este(CC): " + capacitateCilindrica);
        System.out.println("Tipul de combustibil al mașinii este: " + combustibil);
        System.out.println("Lungimea mașinii este: " + lungime);
        System.out.println("Greutatea mașinii este: " + greutate);
        System.out.println("Transmisia mașini este: " + transmisie);
        System.out.println("Puterea mașinii este: " + putere);
        System.out.println("Mașina este înmatriculată? " + esteInmatriculata);
    }
}
