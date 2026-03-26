package Espais;

public class CentreEscolarTest {

    public static void main(String[] args) {

        Institut institut = new Institut();

        institut.espais.add(new Laboratori("Laboratori 1", 75, true, 1200, 20, false, 0, false, 12));

        institut.espais.add(new Informatica("Informàtica 1", 75, true, 6000, 15, false, 0, false, 3));

        institut.espais.add(new Despatx("Oficina 1", 40, true, 600, 3, true));

        institut.espais.add(new Gimnas("Gimnàs", 500, true, 300, 200, false, 0, false, 0, 2000));

        System.out.println("Total consum elèctric: "+institut.consumElectricTotal()+" Kw/m2\n");

        System.out.println(institut.espais);

    }

}