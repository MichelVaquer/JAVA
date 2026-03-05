package Hotel;

public class Reserva {
    private int id_Reserva;
    private Client client;
    private Habitacio habitacio;
    private int numDies;

    public Reserva(int id_Reserva,Client client,Habitacio habitacio,int numDies) {
        this.id_Reserva = id_Reserva;
        this.client = client;
        this.habitacio = habitacio;
        this.numDies = numDies;
    }

    public int getId_Reserva() {
        return id_Reserva;
    }

    public Client getClient() {
        return client;
    }

    public Habitacio getHabitacio(){
        return habitacio;
    }

    public int getnumDies(){
        return numDies;
    }

    public void setNumDies(int numDies) {
        this.numDies = numDies;
    }

    public double getCostTotal(){
        return habitacio.getPreuNit()* numDies;
    }

    @Override
    public String toString() {
        return "Reserva #" + id_Reserva + " | Client: " + client.getNomClient() +
                " | Habitació: " + habitacio.getId() +
                " | Total: " + getCostTotal() + "€";
    }
}
