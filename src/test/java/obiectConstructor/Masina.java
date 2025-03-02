package obiectConstructor;

public class Masina {
    public String marca;
    public String model;
    public int anFabricatie;
    public String motorizare;
    public int pret;

    public Masina(String marca, String model, int anFabricatie, String motorizare, int pret) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public Masina(String marca, String model, int anFabricatie, String motorizare) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.motorizare = motorizare;
    }

    public void detaliiMasina() {
        System.out.println("Marca mașinii este: "+marca);
        System.out.println("Modelul mașinii este: "+model);
        System.out.println("Anul fabricației mașinii este: "+anFabricatie);
        System.out.println("Motorizarea mașinii este: "+motorizare);

        if(pret != 0){
            System.out.println("Pețul mașinii este: "+pret);
        }
    }
}
