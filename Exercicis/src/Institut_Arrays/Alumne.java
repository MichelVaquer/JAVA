package Institut_Arrays;

    public class Alumne {

        private String nom, dni, email;
        private int edat;


        public Alumne(String nom, String dni, String email, int edat) {
            this.nom = nom;
            this.dni = dni;
            this.email = email;
            this.edat = edat;
        }


        public String getNom() {
            return nom;
        }


        public void setNom(String nom) {
            this.nom = nom;
        }


        public String getDni() {
            return dni;
        }


        public void setDni(String dni) {
            this.dni = dni;
        }


        public String getEmail() {
            return email;
        }


        public void setEmail(String email) {
            this.email = email;
        }


        public int getEdat() {
            return edat;
        }


        public void setEdat(int edat) {
            this.edat = edat;
        }

        public String toString() {
            return this.nom + "-" + this.dni;
        }


    }
