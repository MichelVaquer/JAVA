package Espais;

class Laboratori extends Aula {
    private int encenedorsBunsen;

    public Laboratori(String codi, double superficie, boolean llumNatural, double consum, int aforament, boolean pala, int ord, boolean xarxa, int bunsen) {
        super(codi, superficie, llumNatural, consum, aforament, pala, ord, xarxa);
        this.encenedorsBunsen = bunsen;
    }
}