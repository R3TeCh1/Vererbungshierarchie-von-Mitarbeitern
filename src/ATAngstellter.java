import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Kadir Erzurum
 * @version 17.10.2022
 */
public class ATAngstellter extends Mitarbeiter{

    //declare
    private float monatsLohn;

    ATAngstellter(String vorname, String nachname, float monatsLohn){
        super (vorname, nachname);
        this.monatsLohn = monatsLohn;
    }

    public void setMonatsLohn(float monatsLohn){
        this.monatsLohn = monatsLohn;
    }

    public float getMonatsLohn(){
        return monatsLohn ;
    }

    @Override
    public float entgeltBerechnen() {
        if (new GregorianCalendar().get(Calendar.MONTH) == Calendar.JANUARY) jahresgehaltBisHeute = 0;
        super.jahresgehaltBisHeute += monatsLohn;
        return monatsLohn;
    }

}
