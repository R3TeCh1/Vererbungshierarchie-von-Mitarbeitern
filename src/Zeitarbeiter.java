import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Nazanin Golalizadeh
 * @version 17.10.1999
 */

public class Zeitarbeiter extends IMitarbeiter {

        private Float stundenLohn;
        private int gearbeiteteStunden;


    public Zeitarbeiter(String vorname, String nachname, float stundenLohn, int gearbeiteteStunden) {
       super(vorname, nachname);
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

//Setter gearbeiteteStunden
    public void setGearbeiteteStunden(int gearbeiteteStunden) {
        this.gearbeiteteStunden = gearbeiteteStunden;
    }

    @Override
    public float entgeltBerechnen() {
        if (new GregorianCalendar().get(Calendar.MONTH) == Calendar.JANUARY) jahresgehaltBisHeute = 0;
        super.jahresgehaltBisHeute = gearbeiteteStunden * stundenLohn;
        return gearbeiteteStunden * stundenLohn;
    }

}
