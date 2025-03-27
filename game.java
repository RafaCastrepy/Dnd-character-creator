class Card {
    String suit;
    String rank;
    int value; 
}

class Deck {
    List<Card> cards;
    void shuffle();
    Card drawCard();
}

class Pair {
    Card card1;
    Card card2;
    boolean revealedCard1; 
}

class Player {
    String name;
    Pair hand;
    String betOnPair; 
    boolean isBot;
    void placeBet(List<Pair> availablePairs);
}

class Dealer {
    Deck deck;
    Map<String, Pair> allPairs; 
    int pot;
    void deal();
    void revealOneCardEach();
    void takeBets();
    void revealAll();
    void evaluateWinner();
}
