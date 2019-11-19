package cards;

import java.util.List;

public interface SnappableDeck {
    void shuffle();
    String[] getCards();
    SnappableCard deal();
    List<SnappableCard> getListOfCards();
}
