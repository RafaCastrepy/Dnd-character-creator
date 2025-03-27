import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private boolean isBot;
    private Pair hand;
    private String betOn;

    public Player(String name, boolean isBot) {
        this.name = name;
        this.isBot = isBot;
    }

    public void setHand (Pair hand){
        this.hand = hand;
    }

    public Pair getHand(){
        return hand;
    }

    public String getName(){
        return name;
    }

    public String getBeton(){
        return betOn;
    }

    public void placeBet(List<String> pairOptions){
        if (isBot) {
            Random rand = new Random();
            betOn = pairOptions.get(rand.nextInt(pairOptions.size()))
            System.out.println(name + "bets on " + betOn);
        
        
        
        }




    }





}