package Informatica;

public class CPU extends Article {
    private float velocitat;

    public CPU(String codi, String descripcio, int unitats, float preuBase, float velocitat) {
        super(codi, descripcio, unitats, preuBase);
        this.velocitat = velocitat;
    }

    @Override
    public float preu() {
        return preuBase * velocitat;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-15s %-3d %7.1fMHz %7.1f", codi, descripcio, unitats, velocitat, preu());
    }
}