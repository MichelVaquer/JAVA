package Informatica;

import java.util.ArrayList;

public class Botiga {
    private ArrayList<Article> estoc = new ArrayList<>();

    public boolean afegirArticle(Article a) {
        return estoc.add(a);
    }

    public boolean esborrarArticle(Article a) {
        return estoc.remove(a);
    }

    public float valorEstoc() {
        float total = 0;
        for (Article a : estoc) {
            total += a.preu() * a.getUnitats();
        }
        return total;
    }

    public void llistarEstoc() {
        System.out.println("CODI  DESCRIPCIO      UNI   CAP/VEL    PREU");
        System.out.println("----  --------------- ---   ---------  -----");

        int totalDiscs = 0;
        int totalCpus = 0;

        for (Article a : estoc) {
            System.out.println(a.toString());
            if (a instanceof DiscDur) totalDiscs += a.getUnitats();
            if (a instanceof CPU) totalCpus += a.getUnitats();
        }

        System.out.println("\nNombre total de discs durs en estoc: " + totalDiscs);
        System.out.println("Nombre total de CPUs en estoc: " + totalCpus);
        System.out.printf("Valor total de l'estoc: %.1f\n", valorEstoc());
    }
}