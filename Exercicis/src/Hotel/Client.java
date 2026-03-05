package Hotel;

public class Client {

    private String nomClient;
    private String dni;
    private int numTargeta;

    public Client(String nomClient, String dni, int numTargeta) {
        this.nomClient = nomClient;
        this.dni = dni;
        this.numTargeta = numTargeta;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumTargeta() {
        return numTargeta;
    }

    public void setNumTargeta(int numTargeta) {
        this.numTargeta = numTargeta;
    }
}

