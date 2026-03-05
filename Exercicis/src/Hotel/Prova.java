package Hotel;

public class Prova {
    public static void main(String[] args) {

        Client c1 = new Client("Joan Garcia", "12345678X", 229-222-234-233);

        Habitacio h101 = new Habitacio(101, Categoria.luxe, 2);


        Reserva r1 = new Reserva(1, c1, h101, 4);


        System.out.println(r1.toString());


        System.out.println("DNI del client de la reserva: " + r1.getClient().getDni());
    }
}