package Institut_Arrays;

import java.util.*;
public class Institut {

    private String nom;
    private int num;
    private ArrayList<Alumne> llistaAlumnes;   //--> Cuando definimos SIN parentesis


    public Institut(String nom) {
        this.nom = nom;
        this.num = 0;
        this.llistaAlumnes = new ArrayList<>();  //--> En el constructor CON parentesis
    }

    public Institut(String nom, int max) {
        this.nom = nom;
        this.num = 0;
        this.llistaAlumnes = new ArrayList<>(max);
    }


    @Override  //--> Override sirve para proveer una implantación especifica de un metodo ya definido
    public String toString() {
        String retorn = this.nom + "\n";
        for (Alumne a : llistaAlumnes) {
            retorn += a.toString() + "\n";
        }
        return retorn;
    }

    public void afegirAlumne(Alumne a) {
        this.llistaAlumnes.add(a); // En ArrayList se usa .add()
        this.num++;
    }
}

