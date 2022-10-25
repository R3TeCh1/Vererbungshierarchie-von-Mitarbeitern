/**
 * @author Matthias Vollmer
 */
public class Main {
    public static void main(String[] args) {
        Zeitarbeiter zeitarbeiter = new Zeitarbeiter("Nazanin", "Golalizadeh", 15.0f, 40);
        printAndCalculate(zeitarbeiter);

        Angestellter angestellter = new Angestellter("Marcel", "Ebert", 3000.0f, 20);
        printAndCalculate(angestellter);

        ATAngstellter atAngestellter = new ATAngstellter("Kadir", "Erzurum", 2641.52f);
        printAndCalculate(atAngestellter);
    }

    public static void printAndCalculate(IMitarbeiter IMitarbeiter) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println(IMitarbeiter.toString() + " bekommt " + IMitarbeiter.entgeltBerechnen());
        System.out.println("Und hat dieses Jahr " + IMitarbeiter.getJahresgehaltBisHeute() + " erhalten");
    }
}