/**
 * @author Matthias Vollmer
 */
public interface IMitarbeiter {
    float MINDEST_LOHN = 12.00f;

    float entgeltBerechnen();
    String toString();

    /**
     * "Definieren Sie dafür ein Attribut „vertrag“ in der Oberklasse / im Interface"
     *  wenn ich es hier als Attribut/Variable eine Variable anlege, wird die final.
     *  also muss ich hier von der Aufgabe abweichen und eine zu implementierende Methode angeben
     */
    vertragsArtT getVertragsArt();
    static void main(String[] args) {
        Zeitarbeiter zeitarbeiter = new Zeitarbeiter("Nazanin", "Golalizadeh", 15.0f, 40);
        Angestellter angestellter = new Angestellter("Marcel", "Ebert", 3000.0f, 20);
        ATAngestellter atAngestellter = new ATAngestellter("Kadir", "Erzurum", 2641.52f);

        ISteuerZahler[] steuerZahler = {zeitarbeiter, angestellter, atAngestellter};
        for (ISteuerZahler zahler : steuerZahler) {
            printAndCalculate(zahler);
        }
    }

    static void printAndCalculate(ISteuerZahler zahler) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println(zahler.toString());
        System.out.println("voraussichtliche Einkommensteuer: " + zahler.voraussichtlicheEinkommenssteuer());
        System.out.println("tatsächliche Einkommenssteuer:    " + zahler.tatsächlicheEinkommenssteuer());
    }
}
