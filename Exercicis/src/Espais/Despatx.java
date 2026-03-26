package Espais;

class Despatx extends Espai {
    private int nombreTaules;
    private boolean maquinaCafe;

    public Despatx(String codi, double superficie, boolean llumNatural, double consum, int taules, boolean cafe) {
        super(codi, superficie, llumNatural, consum);
        this.nombreTaules = taules;
        this.maquinaCafe = cafe;
    }
}