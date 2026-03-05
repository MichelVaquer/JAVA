package Hotel;

public class Prova {
        public static void main(String[] args) {

            Client c1 = new Client("Joan Garcia", "12345678X", 229293848);
            Client c2 = new Client("Marta Pou", "87654321Y", 998877665);


            Habitacio h101 = new Habitacio(101, Categoria.luxe, 2);
            Habitacio h202 = new Habitacio(202, Categoria.normal, 1);
            Habitacio h303 = new Habitacio(303, Categoria.superluxe, 4);


            Hotel elMeuHotel = new Hotel("Hotel Mettaton", 4);
            elMeuHotel.afegirHabitacions(h101);
            elMeuHotel.afegirHabitacions(h202);
            elMeuHotel.afegirHabitacions(h303);


            Reserva r1 = new Reserva(1, c1, h101, 5); // Joan a la 101 per 5 dies
            Reserva r2 = new Reserva(2, c2, h303, 2); // Marta a la 303 per 2 dies


            System.out.println("\n DETALL DE LES RESERVES ");
            System.out.println(r1.toString());
            System.out.println(r2.toString());


            System.out.println("\n LLISTAT D'HABITACIONS DISPONIBLES");
            for (Habitacio h : elMeuHotel.getHabitacions()) {
                System.out.println("Habitació " + h.getId() + " - Preu nit: " + h.getPreuNit() + "€");
            }
        }
}