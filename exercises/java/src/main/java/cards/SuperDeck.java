package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperDeck implements SnappableDeck {
    private final List<SnappableDeck> decks;
    private final List<SnappableCard> cards;

    public SuperDeck() {
        decks = new ArrayList<>();
        decks.add(new AnimalDeck());
        decks.add(new DeckOfCards());
        cards = new ArrayList<>();
        populateDeckWithCards();
    }

    private void populateDeckWithCards() {
        for (SnappableDeck deck : decks) {
            for(SnappableCard card : deck.getListOfCards()) {
                cards.add(card);
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            SnappableCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public SnappableCard deal() {
        return cards.remove(0);
    }

    @Override
    public List<SnappableCard> getListOfCards() {
        return cards;
    }
}
