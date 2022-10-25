import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Nazanin Golalizadeh
 * @version 25.10.1999
 */

public class Zeitarbeiter implements IMitarbeiter, ISteuerZahler{
        private String vorname;
        private String nachname;
        private Float stundenLohn;
        private int gearbeiteteStunden;
        private int gearbeiteteMonate;
        private float jahresgehaltBisHeute;

    public Zeitarbeiter(String vorname, String nachname, float stundenLohn, int gearbeiteteStunden) {
        if (stundenLohn < MINDEST_LOHN) {
            System.out.println(stundenLohn + " ist zu wenig");
        }
        this.vorname = vorname;
        this.nachname = nachname;
        this.stundenLohn = stundenLohn;
        this.gearbeiteteStunden = gearbeiteteStunden;
        this.gearbeiteteMonate = new GregorianCalendar().get(Calendar.MONTH);
        this.jahresgehaltBisHeute = getJahresgehaltBisHeute();
    }
//Getter


        public String getVorname () {
            return vorname;
        }

        public String getNachname () {
            return nachname;
        }

        public Float getStundenLohn () {
            return stundenLohn;

        }

        public int getGearbeiteteStunden () {
            return gearbeiteteStunden;

        }

        public float getJahresgehaltBisHeute () {
            jahresgehaltBisHeute = 0;
            GregorianCalendar gc = new GregorianCalendar();
            for (int monthes = 0; monthes < gc.get(Calendar.MONTH); monthes++) {
                jahresgehaltBisHeute += entgeltBerechnen();
            }
            return jahresgehaltBisHeute;
        }
//Setter entgeltBerechnen()

        public void setEntgeltBerechnen ( int gearbeiteteStunden){
            this.gearbeiteteStunden = gearbeiteteStunden;
        }

        @Override
        public float entgeltBerechnen () {
            if (gearbeiteteMonate == Calendar.JANUARY) jahresgehaltBisHeute = 0;
            jahresgehaltBisHeute += (gearbeiteteStunden * stundenLohn);
            return (gearbeiteteStunden * stundenLohn);
        }

        public float tatsächlicheEinkommenssteuer () {
            return jahresgehaltBisHeute * 0.36f;
        }

        public float voraussichtlicheEinkommenssteuer () {
            return (jahresgehaltBisHeute / gearbeiteteMonate) * 12f * 0.36f;
        }

        //TOSTRING
        public String toString() {
            return getClass().getSimpleName() + " " + getVertragsArt().art + ": " + nachname + ", " + vorname;
        }

    @Override
    public vertragsArtT getVertragsArt() {
        return vertragsArtT.ZEITARBEITER;
    }
}
