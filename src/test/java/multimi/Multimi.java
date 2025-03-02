package multimi;

import com.beust.ah.A;
import org.testng.annotations.Test;

import java.util.*;

public class Multimi {

    //mulțimi = array, list, set, map

    @Test
    public void metodaTest() {
        //numeCursantiArray();
        //numeCursantiLista();
        //exemplu1Map();
        //exemplu2Map();
        recipeBook();
    }

    //afișăm numele cursanțiilor de la curs
    public void numeCursantiArray() {
        String[] cursanti = new String[10];
        cursanti[0] = "Gabriel";
        cursanti[1] = "Carmen";
        cursanti[2] = "Razvan";
        cursanti[3] = "Alice";
        cursanti[4] = "Andrei";

        int index = 0;
        while (index < cursanti.length) {
            if (index < 5) {
                System.out.println("Numele cursantului este: " + cursanti[index]);
            }
            index++;
        }
    }

    public void numeCursantiLista() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Gabriel");
        cursanti.add("Carmen");
        cursanti.add("Razvan");
        cursanti.add("Alice");
        cursanti.add("Andrei");

        int index = 0;
        while (index < cursanti.size()) {
            System.out.println("Numele cursantului este: " + cursanti.get(index));
            index++;
        }
    }

    //definim niște categorii de valori
    //map are cheie și valoare
    public void exemplu1Map() {
        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("Telefon", "iPhone");
        obiecte.put("Mașină", "Toyota");
        obiecte.put("Fruct", "Mar");

        for (String key : obiecte.keySet()) {
            System.out.println("Cheia curentă este: " + key);
            System.out.println("Valoarea pe baza cheii este: " + obiecte.get(key));
        }
    }

    //afișăm orașele cu țara din care provin
    public void exemplu2Map() {
        Map<String, List<String>> tariOrase = new HashMap<>();
        List<String> oraseRomania = Arrays.asList("Cluj", "Brasov", "Sibiu");
        List<String> oraseItalia = Arrays.asList("Ravenna", "Milano", "Veneția", "Roma");
        List<String> oraseSpania = Arrays.asList("Barcelona", "Valencia", "Madrid");

        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Italia", oraseItalia);
        tariOrase.put("Spania", oraseSpania);


        for (String key : tariOrase.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orașele țării sunt: " + tariOrase.get(key));
        }

    }
    //Temă1: filmare
    //Temă2: o carte de rețete pentru gătit - preparat = cheie | ingrediente = valori

    public void recipeBook() {
        Map<String, List<String>> product = new HashMap<>();
        List<String> chickenSoup = Arrays.asList("Morcovi", "Piept pui", "Apa", "Sare", "Piper", "Pătrunjel");
        List<String> beefWithAsparagus = Arrays.asList("Vită", "Sare", "Piper", "Rozmarin", "Sparanghel");
        List<String> omelette = Arrays.asList("Ouă", "Sare", "Piper", "Lapte", "Ceapă", "Slanină");
        List<String> lavaCake = Arrays.asList("Cicolată", "Unt", "Făină", "Ouă", "Esență vanilie", "Înghețată", "Zahăr");

        product.put("Omletă țărănească", omelette);
        product.put("Supă de pui", chickenSoup);
        product.put("Vită cu sparanghel", beefWithAsparagus);
        product.put("Lava Cake", lavaCake);

        for (String key : product.keySet()) {
            System.out.println("Preparatul este: "+ key);
            System.out.println("Ingredientele sunt: "+product.get(key));
        }
    }

}
