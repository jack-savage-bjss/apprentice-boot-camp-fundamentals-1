package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards implements SnappableDeck {
    private final List<Suit> suitList;
    private static final String[] suitNames = {"clubs", "diamonds", "hearts", "spades"};
    private final List<PlayingCard> cardsList;

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.printDeck();
    }

    public DeckOfCards() {
        this.suitList = buildDeck(suitNames);
        cardsList = getCardsAsCardList();
    }

    private List<Suit> buildDeck(String[] suitNames) {
        List<Suit> suitList = new ArrayList<>();
        for (String suitName : suitNames) {
            Suit currentSuit = new Suit(suitName, 13);
            suitList.add(currentSuit);
        }
        return suitList;
    }

    public List<PlayingCard> getCardsAsCardList() {
        List<PlayingCard> playingCardList = new ArrayList<>();
        for (Suit suit : suitList) {
            for (PlayingCard playingCard : suit.getCardsInSuit()) {
                playingCardList.add(playingCard);
            }
        }
        return playingCardList;
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

    public void printDeck() {
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