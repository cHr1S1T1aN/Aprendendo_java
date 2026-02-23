public class Card {

    private String face; // valor da carta
    private String suit; // naipe da carta

    // construtor
    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    // retorna representação em String
    @Override
    public String toString() {
        return face + " of " + suit;
    }
}