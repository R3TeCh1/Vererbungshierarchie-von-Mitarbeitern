/**
 * @author Matthias Vollmer
 */
public class Main {
    public static void main(String[] args) {
        Zeitarbeiter zeitarbeiter = new Zeitarbeiter("Nazanin", "Golalizadeh", 15.0f, 40);
        printAndCalculate(zeitarbeiter);
        System.out.println("Und hat dieses Jahr " + zeitarbeiter.getJahresgehaltBisHeute() + " erhalten");

        Angestellter angestellter = new Angestellter("Marcel", "Ebert", 3000.0f, 20);
        printAndCalculate(angestellter);
        System.out.println("Und hat dieses Jahr " + angestellter.getJahresgehaltBisHeute() + " erhalten");

        ATAngstellter atAngestellter = new ATAngstellter("Kadir", "Erzurum", 2641.52f);
        printAndCalculate(atAngestellter);
        System.out.println("Und hat dieses Jahr " + atAngestellter.getJahresgehaltBisHeute() + " erhalten");
    }

    public static void printAndCalculate(IMitarbeiter IMitarbeiter) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println(IMitarbeiter.toString() + " bekommt " + IMitarbeiter.entgeltBerechnen());
    }
}