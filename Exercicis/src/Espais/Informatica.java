package Espais;

class Informatica extends Aula {
    private int numImpressores;

    public Informatica(String codi, double superficie, boolean llumNatural, double consum, int aforament, boolean pala, int ord, boolean xarxa, int impressores) {
        super(codi, superficie, llumNatural, consum, aforament, pala, ord, xarxa);
        this.numImpressores = impressores;
    }
}