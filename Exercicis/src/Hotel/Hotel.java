package Hotel;

import java.util.*;

public class Hotel {
    private String nom;
    private double estrelles;
    private ArrayList<Habitacio> habitacions;

    public Hotel(String nom, double estrelles) {
        this.nom = nom;
        this.estrelles = estrelles;
        this.habitacions = new ArrayList<>();
    }

    public void afegirHabitacions(Habitacio h){
        this.habitacions.add(h);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getEstrelles() {
        return estrelles;
    }

    public void setEstrelles(double estrelles) {
        this.estrelles = estrelles;
    }

    public ArrayList<Habitacio> getHabitacions() {
        return habitacions;
    }
}
