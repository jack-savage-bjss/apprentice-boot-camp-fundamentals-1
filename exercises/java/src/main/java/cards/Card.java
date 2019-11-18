package cards;

public class Card {
    private String suitName;
    private String value;

    public Card(String suitName) {
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
}
