package cards;

import java.util.ArrayList;
import java.util.List;

public class Suit {
    String suitName;
    Integer suitLength;
    private final List<PlayingCard> cardsInSuit = new ArrayList<>();

    public List<PlayingCard> getCardsInSuit() {
        return cardsInSuit;
    }

    public Suit(String suitName, Integer suitLength) {
        this.suitName = suitName;
        this.suitLength = suitLength;
        this.buildSuit();
    }

    private List<PlayingCard> buildSuit() {
        for (int i = 1; i <= suitLength; i++) {
            PlayingCard currentPlayingCard = new PlayingCard(suitName);
            String cardValue = determineCardValue(i);
            currentPlayingCard.setValue(cardValue);
            cardsInSuit.add(currentPlayingCard);
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
