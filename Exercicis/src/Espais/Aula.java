package Espais;

class Aula extends Espai {
    protected int aforament;
    protected boolean cadiresPala;
    protected int numOrdinadors;
    protected boolean connectorsXarxa;

    public Aula(String codi, double superficie, boolean llumNatural, double consum, int aforament, boolean pala, int ord, boolean xarxa) {
        super(codi, superficie, llumNatural, consum);
        this.aforament = aforament;
        this.cadiresPala = pala;
        this.numOrdinadors = ord;
        this.connectorsXarxa = xarxa;
    }

    public double espaiPerEstudiant() {
        return superficie / aforament;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Espai/alumne: %.2f m2", espaiPerEstudiant());
    }
}
