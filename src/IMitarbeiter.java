import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Matthias Vollmer
 */
public interface IMitarbeiter {

    float MINDEST_LOHN = 12.00f;

    float entgeltBerechnen();
    String toString();


}
