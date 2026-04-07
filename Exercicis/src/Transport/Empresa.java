package Transport;

import java.util.ArrayList;

public class Empresa {
    public ArrayList<Transport> transports;

    public Empresa() {
        this.transports = new ArrayList<>();
    }

    public boolean afegirTransport(Transport t) {
        return transports.add(t);
    }

    public boolean esborrarTransport(Transport t) {
        return transports.remove(t);
    }

    public void llistarTransports() {
        for (Transport t : transports) {
            System.out.println("ID: " + t.getIdentificador() + " | Tipus: " + t.getClass().getSimpleName());
        }
    }
}