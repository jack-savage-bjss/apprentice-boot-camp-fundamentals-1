package cards;

public interface SnappableDeck {
    void shuffle();
    String[] getCards();
    SnappableCard deal();
}
