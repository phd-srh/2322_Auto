public class Auto {
    // Attribute
    private int achsenanzahl;

    public Auto(int achsenanzahl) {
        this.achsenanzahl = achsenanzahl;
    }

    // Methode(n)
    public void fahren() {
        System.out.println("Auto fährt mit " + achsenanzahl + " Achsen");
    }
}
