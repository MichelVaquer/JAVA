package Institut_Arrays;

public class UsaInstitut {

    public static void main(String[] args) {


        Alumne michel = new Alumne("Michel", "3333H", "michel@a.com", 20);
        Alumne aleix = new Alumne("Aleix", "3333H", "pau@a.com", 20);

        Alumne jan = new Alumne("Pau", "444H", "pau@mail.com", 18);
        Alumne joel = new Alumne("Jordi", "555H", "jordi@mail.com", 20);


        Institut jaumehuguet = new Institut("Jaume Huguet");
        Institut narcis = new Institut("Narcis Oller", 150);


        jaumehuguet.afegirAlumne(michel);
        jaumehuguet.afegirAlumne(aleix);

        narcis.afegirAlumne(jan);
        narcis.afegirAlumne(joel);


        System.out.println("\n--- LLISTA JAUME HUGUET ---");
        System.out.println(jaumehuguet);

        System.out.println("----------");

        System.out.println("--- LLISTA NARCIS OLLER ---");
        System.out.println(narcis);
    }
}