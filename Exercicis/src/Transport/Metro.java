package Transport;

public class Metro extends Transport {
    private double preuBitllet;

    public Metro(String identificador, double velocitat) {
        super(identificador, velocitat);
    }

    public Metro(String identificador, double velocitat, double preuBitllet) {
        super(identificador, velocitat);
        this.preuBitllet = preuBitllet;
    }

    @Override
    public double calculaCost(double distancia) {
        return preuBitllet; // Fixed cost regardless of distance
    }

    public double getPreuBitllet() { return preuBitllet; }
    public void setPreuBitllet(double preuBitllet) { this.preuBitllet = preuBitllet; }
}