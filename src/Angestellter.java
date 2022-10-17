import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Angestellter extends Mitarbeiter{

  private float monatslohn;
  private float überStundenTarif;
  private int gearbeiteteÜberstunden;

  public Angestellter(String vorname, String nachname, float monatslohn, float überStundenTarif) {
    super(vorname, nachname);
    this.monatslohn = monatslohn;
    this.überStundenTarif = überStundenTarif;
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

  @Override
  public float entgeltBerechnen() {
    if (new GregorianCalendar().get(Calendar.MONTH) == Calendar.JANUARY) jahresgehaltBisHeute = 0;
    super.jahresgehaltBisHeute += monatslohn + (gearbeiteteÜberstunden * überStundenTarif);
    return monatslohn + (gearbeiteteÜberstunden * überStundenTarif);
  }
}
