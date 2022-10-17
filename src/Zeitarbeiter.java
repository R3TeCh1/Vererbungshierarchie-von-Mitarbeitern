/**
 * @author Nazanin Golalizadeh
 * @version 17.10.1999
 */

public class Zeitarbeiter {

        private String vorname;
        private String nachname;
        private Float stundenLohn;
        private int gearbeiteteStunden;


    public Zeitarbeiter(String vorname, String nachname, float stundenLohn, int gearbeiteteStunden) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.stundenLohn = stundenLohn;
        this.gearbeiteteStunden = gearbeiteteStunden;
    }


//Getter

        public String getVorname(){
            return vorname;
        }

        public String getNachname(){
            return nachname;
        }

        public Float getStundenLohn(){
            return stundenLohn;

        }

    public int getGearbeiteteStunden(){
        return gearbeiteteStunden;

    }
//Setter entgeltBerechnen()

    public void setEntgeltBerechnen(int gearbeiteteStunden) {
        this.gearbeiteteStunden = gearbeiteteStunden;
    }

    public float entgeldBerechnen() {
        return gearbeiteteStunden;
    }

}
