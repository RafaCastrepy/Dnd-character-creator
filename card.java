public class Card {
    private String suit;
    private String rank;
    private int value;

    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
        this.value = assignValue(rank);
    }

    private int assignValue(String rank)
        switch (rank) {
            case "J"
            case "K"
            case "Q"
            case "A"
                return 10;
            default:
                return Integer.parseInt(rank);
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return rank + " of " suit;
    }










}