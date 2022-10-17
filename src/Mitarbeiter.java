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
        return jahresgehaltBisHeute;
    }

    public String toString() {
        return getClass().getSimpleName() + " " + nachname + ", " + vorname;
    }

    public abstract float entgeltBerechnen();
}
