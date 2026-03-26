package Espais;

public abstract class Espai {
    protected String codi;
    protected double superficie;
    protected boolean llumNatural;
    protected double consumElectric; // en Kwh

    public Espai(String codi, double superficie, boolean llumNatural, double consumElectric) {
        this.codi = codi;
        this.superficie = superficie;
        this.llumNatural = llumNatural;
        this.consumElectric = consumElectric;
    }

    public double consumPerMetreQuadrat() {
        return consumElectric / superficie;
    }

    @Override
    public String toString() {
        return String.format("\n[%s] Consum: %.2f Kw/m2", codi, consumPerMetreQuadrat());
    }
}