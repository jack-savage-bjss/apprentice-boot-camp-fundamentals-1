package cards;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private final List<Suit> suitList;
    private static final String[] suitNames = {"clubs", "diamonds", "hearts", "spades"};
    private final List<Card> cardsList;

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.printDeck();
    }

    public DeckOfCards() {
        this.suitList = buildDeck(suitNames);
        cardsList = getCardsAsCardList();
    }

    private static List<Suit> buildDeck(String[] suitNames) {
        List<Suit> suitList = new ArrayList<>();
        for (String suitName : suitNames) {
            Suit currentSuit = new Suit(suitName, 13);
            suitList.add(currentSuit);
        }
        return suitList;
    }

    public List<Card> getCardsAsCardList() {
        List<Card> cardList = new ArrayList<>();
        for (Suit suit : suitList) {
            for (Card card : cardList) {
                cardsList.add(card);
            }
        }
        return cardsList;
    }

    public String[] getCards() {
        List<String> cardsAsStringArrayList = new ArrayList<>();
        for (Suit suit : suitList) {
            for (Card card : suit.getCardsInSuit()) {
                cardsAsStringArrayList.add(card.getValue() + " of " + card.getSuitName());
            }
        }
        String[] cardsAsStringArray = new String[cardsAsStringArrayList.size()];
        for (int i = 0; i < cardsAsStringArrayList.size(); i++) {
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
}