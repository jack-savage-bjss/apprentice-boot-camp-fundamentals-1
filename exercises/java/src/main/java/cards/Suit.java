package cards;

import java.util.ArrayList;
import java.util.List;

public class Suit {
    String suitName;
    Integer suitLength;
    private final List<Card> cardsInSuit = new ArrayList<>();

    public List<Card> getCardsInSuit() {
        return cardsInSuit;
    }

    public Suit(String suitName, Integer suitLength) {
        this.suitName = suitName;
        this.suitLength = suitLength;
        this.buildSuit();
    }

    private List<Card> buildSuit() {
        for (int i = 1; i <= suitLength; i++) {
            Card currentCard = new Card(suitName);
            String cardValue = determineCardValue(i);
            currentCard.setValue(cardValue);
            cardsInSuit.add(currentCard);
        }
        return cardsInSuit;
    }

    private String determineCardValue(Integer cardNumber) {
        if(cardNumber == 1) {
            return "ace";
        }
        else if(cardNumber == 11) {
            return "jack";
        }
        else if(cardNumber == 12) {
            return "queen";
        }
        else if(cardNumber == 13) {
            return "king";
        }
        else {
            return cardNumber.toString();
        }
    }
}
