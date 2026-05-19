import java.util.Random;

public class DeckOfCards {

    private Card[] deck; // array de objetos Card
    private int currentCard; // índice do próximo Card a ser distribuído
    private static final int NUMBER_OF_CARDS = 52; // número constante de Cards
    private static final Random randomNumbers = new Random(); // gerador aleatório

    // construtor preenche o baralho
    public DeckOfCards() {

        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(
                    faces[count % 13],
                    suits[count / 13]
            );
        }
    }

    // embaralha as cartas
    public void shuffle() {

        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {

            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    // distribui uma carta
    public Card dealCard() {

        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }
}