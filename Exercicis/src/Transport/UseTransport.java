package Transport;

public class UseTransport {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        empresa.afegirTransport(new Bicicleta("Tricicle", 3,5));

        empresa.afegirTransport(new Bicicleta("Mountain bike", 14,5));

        empresa.afegirTransport(new Bicicleta("Votec",20,7));

        empresa.afegirTransport(new Metro("Tramvia",45,1.5));

        empresa.afegirTransport(new Metro("Tren",90,8));

        empresa.afegirTransport(new Metro("Ave",200,45));

        empresa.afegirTransport(new Cotxe("Dacia",120,"Gasoil",1.18, 0.05));

        empresa.afegirTransport(new Cotxe("Lamborghini",170,"Gasolina",1.56, 0.2));

        empresa.llistarTransports();



        System.out.println("\n\n==============================\n");

        System.out.println("Temps i cost en recorrer 50.000 km  ");

        System.out.println("------------------------------------");



        String s;

        for (Transport t : empresa.transports) {

            s= t.getIdentificador();

            while (s.length()<20) s+=" ";

            s+= Math.floor(t.calculaCost(50000)) + " €";

            while (s.length()<30) s+=" ";

            s+= String.format( "%.2f",t.calculaTemps(50000))+" hores";

            System.out.println(s);

        }

    }

}