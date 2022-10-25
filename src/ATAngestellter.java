import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Kadir Erzurum
 * @version 17.10.2022
 */
public class ATAngestellter implements IMitarbeiter, ISteuerZahler{

    //declare
    private String vorname;
    private String nachname;
    private float jahresgehaltBisHeute;
    private float monatslohn;
    private int gearbeiteteMonate;

    ATAngestellter(String vorname, String nachname, float monatsLohn){
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatslohn = monatsLohn;
        this.gearbeiteteMonate = new GregorianCalendar().get(Calendar.MONTH);
        this.jahresgehaltBisHeute = getJahresgehaltBisHeute();
        if(monatslohn/(40*4) < MINDEST_LOHN) {
            System.out.println("Monatslohn: " + monatslohn + ", ist weniger als der Mindestlohn.");
        }
    }


    public float getMonatsLohn(){
        return monatslohn;
    }

    public float voraussichtlicheEinkommenssteuer() {
        return (jahresgehaltBisHeute/gearbeiteteMonate) * 12f * 0.16f;
    }

    @Override
    public float tatsächlicheEinkommenssteuer() {
        return jahresgehaltBisHeute * 0.16f;
    }

    public float getJahresgehaltBisHeute() {
        jahresgehaltBisHeute = 0;
        GregorianCalendar gc = new GregorianCalendar();
        for (int months = 0; months < gc.get(Calendar.MONTH); months++) {
            jahresgehaltBisHeute += entgeltBerechnen();
        }
        return jahresgehaltBisHeute;
    }

    @Override
    public float entgeltBerechnen() {
        if (new GregorianCalendar().get(Calendar.MONTH) == Calendar.JANUARY) jahresgehaltBisHeute = 0;
        jahresgehaltBisHeute += monatslohn;
        return monatslohn;
    }

    public String toString() {
        return getClass().getSimpleName() + " " + getVertragsArt().art + ": " + nachname + ", " + vorname;
    }

    @Override
    public vertragsArtT getVertragsArt() {
        return vertragsArtT.AT_ANGESTELLTER;
    }
}
