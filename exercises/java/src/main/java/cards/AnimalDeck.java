package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnimalDeck implements SnappableDeck {

    private List<SnappableCard> cards;

    AnimalDeck() {
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            SnappableCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    public SnappableCard deal() {
        return cards.remove(0);
    }

    @Override
    public List<SnappableCard> getListOfCards() {
        return cards;
    }
}