package Espais;

class Gimnas extends Aula {
    private int numDutxes;
    private int numGrades;

    public Gimnas(String codi, double superficie, boolean llumNatural, double consum, int aforament, boolean pala, int ord, boolean xarxa, int dutxes, int grades) {
        super(codi, superficie, llumNatural, consum, aforament, pala, ord, xarxa);
        this.numDutxes = dutxes;
        this.numGrades = grades;
    }

    @Override
    public double espaiPerEstudiant() {
        // Cada grada equival a 1m2 addicional segons l'enunciat
        return (superficie + numGrades) / aforament;
    }
}