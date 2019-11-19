package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards implements SnappableDeck {
    private final List<Suit> suitList;
    private static final String[] suitNames = {"clubs", "diamonds", "hearts", "spades"};
    private final List<SnappableCard> cardsList;

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.printDeck();
    }

    public DeckOfCards() {
        this.suitList = buildDeck();
        cardsList = getCardsAsCardList();
    }

    private List<Suit> buildDeck() {
        List<Suit> suitList = new ArrayList<>();
        for (String suitName : DeckOfCards.suitNames) {
            Suit currentSuit = new Suit(suitName, 13);
            suitList.add(currentSuit);
        }
        return suitList;
    }

    private List<SnappableCard> getCardsAsCardList() {
        List<SnappableCard> playingCardList = new ArrayList<>();
        for (Suit suit : suitList) {
            playingCardList.addAll(suit.getCardsInSuit());
        }
        return playingCardList;
    }

    @Override
    public List<SnappableCard> getListOfCards() {
        return cardsList;
    }

    public String[] getCards() {
        List<String> cardsAsStringArrayList = new ArrayList<>();
        for (Suit suit : suitList) {
            for (PlayingCard playingCard : suit.getCardsInSuit()) {
                cardsAsStringArrayList.add(playingCard.getValue() + " of " + playingCard.getSuitName());
            }
        }
        String[] cardsAsStringArray = new String[cardsList.size()];
        for (int i = 0; i < cardsList.size(); i++) {
            cardsAsStringArray[i] = cardsAsStringArrayList.get(i);
        }
        return cardsAsStringArray;
    }

    private void printDeck() {
        String[] deck = getCards();
        for (String card : deck) {
            System.out.println(card);
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cardsList);
    }

    @Override
    public SnappableCard deal() {
        return cardsList.remove(0);
    }
}