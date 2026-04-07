package Transport;

public abstract class Transport {
    private String identificador;
    private double velocitat;

    public Transport(String identificador, double velocitat) {
        this.identificador = identificador;
        this.velocitat = velocitat;
    }

    public double calculaTemps(double distancia) {
        return distancia / this.velocitat;
    }

    public abstract double calculaCost(double distancia);

    public double getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(double velocitat) {
        this.velocitat = velocitat;
    }

    public String getIdentificador() {
        return identificador;
    }
}