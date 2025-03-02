package oop;

public class Masina {
    //OOP concepte: Moștenire, Încapsulare, Polimorfism și Abstractizare
    //moștenire = conceptul prin care o clasă moștenește o altă clasă
    //clasa care moștenește se numește clasă copil
    //clasa care este moștenită se numește clasă părinte
    //în Java, o clasă poate moșteni doar o singură clasă
    //în momentul când copilul moștenește părintele, trebuie să apeleze constructorul din părinte cu super()
    //în momentul când copilul moștenește părintele, copilul are acces la variabile/metode din părinte (dacă sunt publice/protected)

    //încapsulare = conceptul prin care restricțonăm unele va riabile/metode în momentul în care ies din zona în care au fost declarate
    //restricționarea se poate face folosind access control de tipul: private sau protected

    //polimorfism = conceptul prin care o metodă poate suferi modificări la nivel de conținut (dinamic) sau structură (static)
    //polimorfismul este de 2 feluri: Dinamic(override) și Static(overload)
    //polimorfismul dinamic = într-o ierarhie de clase obținute prin moștenire o metodă poate avea implementări diferite
    //polomorfismul static = conceptul pe baza căruia o metodă poate fi definită în funcție de numărul/tipul de parametrii
    //polimorfismul dinamic se aplică în momentul în care avem o legătură părinte-copil
    //polomorfismul static se aplică indiferent de circumstanțe


    private String marca;
    private String model;
    private String culoare;
    private int an;
    private double pret;

    public Masina(String marca, String model, String culoare, int an) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
    }

    public Masina(String marca, String model, String culoare, int an, double pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
        this.pret = pret;
    }

    public void infoMasina() {
        System.out.println("Marca mașinii este: " + marca);
        System.out.println("Modelul mașinii este: " + model);
        System.out.println("Culoarea mașinii este: " + culoare);
        System.out.println("Anul de fabricație al mașinii este: " + an);
        if (pret != 0) {
            System.out.println("Prețul mașinii este: " + pret);
        }


    }

    //polimorfism Dinamic

    public void pornesteMasina() {
        System.out.println("Mașina pornește cu cheia.");
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public double getPret() {
        return pret;
    }
}


