package Transport;

public class Cotxe extends Transport {
    private String tipuscombustible;
    private double preuLitre;
    private double litresKm;

    public Cotxe(String identificador, double velocitat) {
        super(identificador, velocitat);
    }

    public Cotxe(String identificador, double velocitat, String tipuscombustible, double preuLitre, double litresKm) {
        super(identificador, velocitat);
        this.tipuscombustible = tipuscombustible;
        this.preuLitre = preuLitre;
        this.litresKm = litresKm;
    }

    @Override
    public double calculaCost(double distancia) {
        return distancia * litresKm * preuLitre;
    }

    public String getTipuscombustible() { return tipuscombustible; }
    public double getPreuLitre() { return preuLitre; }
    public double getLitresKm() { return litresKm; }
}