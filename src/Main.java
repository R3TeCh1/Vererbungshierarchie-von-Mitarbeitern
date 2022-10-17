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

    public static void printAndCalculate(Mitarbeiter mitarbeiter) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println(mitarbeiter.toString() + " bekommt " + mitarbeiter.entgeltBerechnen());
        System.out.println("Und hat dieses Jahr " + mitarbeiter.getJahresgehaltBisHeute() + " erhalten");
    }
}