import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Deck {
    private final ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String suit : suits) {
            for (String value : values) {
                String color = (suit.equals("Corazones") || suit.equals("Diamantes")) ? "Rojo" : "Negro";
                cards.add(new Card(suit, color, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (cards.isEmpty()) {
            System.out.println("No hay más cartas en el Deck.");
        } else {
            Card card = cards.removeFirst();
            System.out.println(card);
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        }
    }

    public void pick() {
        if (cards.isEmpty()) {
            System.out.println("No hay más cartas en el Deck.");
        } else {
            Random random = new Random();
            Card card = cards.remove(random.nextInt(cards.size()));
            System.out.println(card);
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        }
    }

    public void hand() {
        if (cards.size() < 5) {
            System.out.println("No hay suficientes cartas en el Deck.");
        } else {
            for (int i = 0; i < 5; i++) {
                Card card = cards.removeFirst();
                System.out.println(card);
            }
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        }
    }
}
