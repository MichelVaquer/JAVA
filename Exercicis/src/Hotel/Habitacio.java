package Hotel;

public class Habitacio {
    private Categoria categoria;
    private double Llits;
    private double id;

    public double getPreuNit() {  // Metode Switch Case
        return switch (this.categoria) {
            case superluxe -> 200.0;
            case luxe   -> 100.0;
            case normal    -> 60.0;
        };
    }

    public Habitacio (double llits, Categoria categoria, double id ) {
        this.categoria = categoria;
        this.Llits = llits;
        this.id= id;
    }

    public double getId() {
        return id;
    }

    public void setLlits(double llits) {
        Llits = llits;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categroria) {
        this.categoria = categoria;
    }

    public double calcularCostEstada(int nits) {
        return getPreuNit() * nits;
    }

    @Override
    public String toString() {
        return "Habitació [ID: " + id + ", Categoria: " + categoria + ", Llits: " + Llits + "]";
    }
}


