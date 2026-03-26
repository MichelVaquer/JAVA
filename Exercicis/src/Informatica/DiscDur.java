package Informatica;

public class DiscDur extends Article {
    private float capacitat;

    public DiscDur(String codi, String descripcio, int unitats, float preuBase, float capacitat) {
        super(codi, descripcio, unitats, preuBase);
        this.capacitat = capacitat;
    }

    @Override
    public float preu() {
        return (preuBase * capacitat) * 0.9f;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-15s %-3d %7.1fGB %7.1f", codi, descripcio, unitats, capacitat, preu());
    }
}