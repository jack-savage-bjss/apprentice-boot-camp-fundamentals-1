package cards;

public class PlayingCard implements SnappableCard {
    private String suitName;
    private String value;

    public PlayingCard(String suitName) {
        this.suitName = suitName;
    }

    void setValue(String value) {
        this.value = value;
    }

    public String getSuitName() {
        return suitName;
    }

    public String getValue() {
        return value;
    }

    public boolean snap(SnappableCard otherCard) {
        if (otherCard instanceof PlayingCard) {
            PlayingCard otherCardAsPlayingCard = (PlayingCard) otherCard;
            return (this.getValue().equals(otherCardAsPlayingCard.getValue()));
        }
        return false;
    }

    @Override
    public String toString() {
        return suitName + " " + value;
    }
}
