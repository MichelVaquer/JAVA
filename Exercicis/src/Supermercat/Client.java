package Supermercat;

import java.util.ArrayList;

    public class Client {

        private String nom;
        private ArrayList<Producte> productes;

        public Client(String nomClient) {
            this.nom = nomClient;
            this.productes = new ArrayList<>();
    }

        public void afegirProductes(Producte p){
            productes.add(p);
    }

        public double calcularFactura() {
            double total = 0.0;


            for (Producte p : this.productes) {
                total += p.getPreu();
            }

            return total;
        }

}

