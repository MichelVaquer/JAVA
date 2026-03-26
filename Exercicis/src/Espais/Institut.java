package Espais;

import java.util.ArrayList;
import java.util.List;

public class Institut {
    public List<Espai> espais = new ArrayList<>();

    public double consumElectricTotal() {
        double total = 0;
        for (Espai e : espais) {
            total += e.consumPerMetreQuadrat();
        }
        return total;
    }
}