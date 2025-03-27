public class Pair {
    private Card card1;
    private Card card2;
    private boolean card1_Revealed;
    private boolean card2_Revealed;

    public Pair(Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
        this.card1_Revealed = false;
        this.card2_Revealed = false;
    }

    public int getTotalValue() {
        return card1.getValue() + card2.getValue();
    }

    public void reveal_Card1() {
        card1_Revealed = true;

    }

    public void reveal_Card2() {
        card2_Revealed = true;
        
    }

    public Card getCard1() {
        return card1;
    }
    public Card getCard2() {
        return card2;
    }

    public boolean is_Card1_revealed() {
        return card1_Revealed;
    }

    public boolean is_Card2_revealed() {
        return card2_Revealed;
    }

    public String toString () {
        String c1 = card1_Revealed ? card1.toString() : "Hidden" ;
        String c2 = card2_Revealed ? card2.toString() : "Hidden" ;
        return "["+ c1 + "|" + c2 + "]" ;
    }


}