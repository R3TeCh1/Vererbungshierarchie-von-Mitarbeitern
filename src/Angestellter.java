import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Ebert Marcel
 */
public class Angestellter implements IMitarbeiter, ISteuerZahler {

  private String vorname;
  private String nachname;
  private float jahresgehaltBisHeute;// should of been private
  private float monatslohn;
  private float überStundenTarif;
  private int gearbeiteteÜberstunden;
  private int gearbeiteteMonate;

  public Angestellter(String vorname, String nachname, float monatslohn, float überStundenTarif) {
    if(monatslohn/(40*4) < MINDEST_LOHN) {
      System.out.println(monatslohn + " ist zu wenig");
    }
    this.vorname = vorname;
    this.nachname = nachname;
    this.monatslohn = monatslohn;
    this.überStundenTarif = überStundenTarif;
    this.gearbeiteteMonate = new GregorianCalendar().get(Calendar.MONTH);
    this.jahresgehaltBisHeute = getJahresgehaltBisHeute();
  }

  public float getMonatslohn() {
    return monatslohn;
  }

  public float getÜberStundenTarif() {
    return überStundenTarif;
  }

  public int getGearbeiteteÜberstunden() {
    return gearbeiteteÜberstunden;
  }

  public void setGearbeiteteÜberstunden(int gearbeiteteÜberstunden) {
    this.gearbeiteteÜberstunden = gearbeiteteÜberstunden;
  }

  public void setGearbeiteteMonate(int gearbeiteteMonate) {
    this.gearbeiteteMonate = gearbeiteteMonate;
  }

  public float getJahresgehaltBisHeute() {
    jahresgehaltBisHeute = 0;
    GregorianCalendar gc = new GregorianCalendar();
    for (int monthes = 0; monthes < gc.get(Calendar.MONTH); monthes++) {
      jahresgehaltBisHeute += entgeltBerechnen();
    }
    return jahresgehaltBisHeute;
  }

  @Override
  public float entgeltBerechnen() {
    if (gearbeiteteMonate == Calendar.JANUARY) jahresgehaltBisHeute = 0;
    jahresgehaltBisHeute += monatslohn + (gearbeiteteÜberstunden * überStundenTarif);
    return monatslohn + (gearbeiteteÜberstunden * überStundenTarif);
  }

  public float tatsächlicheEinkommenssteuer() {
    return jahresgehaltBisHeute * 0.36f;
  }

  public float voraussichtlicheEinkommenssteuer() {
    return (jahresgehaltBisHeute/gearbeiteteMonate) * 12f * 0.36f;
  }
  public String toString() {
    return getClass().getSimpleName() + " " + getVertragsArt().art + ": " + nachname + ", " + vorname;
  }

  @Override
  public vertragsArtT getVertragsArt() {
    return vertragsArtT.ANGESTELLTER;
  }
}
