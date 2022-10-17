import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Matthias Vollmer
 */
public abstract class Mitarbeiter {
    protected String vorname;
    protected String nachname;
    protected float jahresgehaltBisHeute;

    Mitarbeiter(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return nachname;
    }

    public float getJahresgehaltBisHeute() {
        jahresgehaltBisHeute = 0;
        GregorianCalendar gc = new GregorianCalendar();
        for (int monthes = 0; monthes < gc.get(Calendar.MONTH); monthes++) {
            jahresgehaltBisHeute += entgeltBerechnen();
        }
        return jahresgehaltBisHeute;
    }

    public String toString() {
        return getClass().getSimpleName() + " " + nachname + ", " + vorname;
    }

    public abstract float entgeltBerechnen();
}
