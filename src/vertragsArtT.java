enum vertragsArtT {
    ZEITARBEITER("Teilzeitarbeitsvertrag"),
    ANGESTELLTER("Angestelltenarbeitsvertrag"),
    AT_ANGESTELLTER("AT-Vertrag");

    String art;

    vertragsArtT(String art) {
        this.art = art;
    }
}
