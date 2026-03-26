package Supermercat;

public class Producte {

    private String nom;
    private Float  preu;

    public Producte(String nom, Float preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public Float getPreu(){
        return preu;
    }

    public String toString() {
        return String.format("Producte: %-15s | Preu: %.2f€", nom, preu);
    }
}
