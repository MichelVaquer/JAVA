package Transport;

public class Bicicleta extends Transport {
    private int nombreMarxes;

    public Bicicleta(String identificador, double velocitat) {
        super(identificador, velocitat);
    }

    public Bicicleta(String identificador, double velocitat, int nombreMarxes) {
        super(identificador, velocitat);
        this.nombreMarxes = nombreMarxes;
    }

    @Override
    public double calculaCost(double distancia) {
        // Usually bicycles have 0 monetary cost per distance
        return 0.0;
    }

    public int getNombreMarxes() { return nombreMarxes; }
}