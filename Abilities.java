package Dnd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 
import java.util.Random;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Abilities {
    private Map<String, Integer> abilitiesMap;
    public Abilities(Map<String, Integer>abilitiesMap){
    this.abilitiesMap=abilitiesMap;
    }
    public int randomAbilityScore() {
        Random d6 = new Random();  
        int roll1 = d6.nextInt(6) + 1; 
        int roll2 = d6.nextInt(6) + 1;  
        int roll3 = d6.nextInt(6) + 1;  
        int roll4 = d6.nextInt(6) + 1; 
        int[] rolls = {roll1, roll2, roll3, roll4};
        Arrays.sort(rolls);
        System.out.println("your rolls were " + Arrays.toString(rolls));

        int sum = 0;
        for (int i = 1; i < rolls.length; i++) {
            sum += rolls[i]; 
        }
        System.out.println("your random ability score is " + sum);
        return sum;
    }
    public Map<String, Integer> assignScores(List<Integer> scoreList) {
        List<String> abilitiesList = new ArrayList<>(Arrays.asList("strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma"));
        boolean found = false;
        String chosenAbility = "";  

        for (int i = 0; i < 6; i++) {
        do{
            System.out.println("the score is " + scoreList);
            System.out.println("the score is " + scoreList.get(0));
            System.out.println("Enter which ability you would like to assign this score " + abilitiesList);
            chosenAbility = scanner.nextLine().toLowerCase();
            
            found = abilitiesList.contains(chosenAbility);
            if (!found) {
                System.out.println("Invalid ability. Please select another ability to assign.");
            }
        } while (!found);
    
        
        switch (chosenAbility) {
            case "strength":
            case "dexterity":
            case "constitution":
            case "intelligence":
            case "wisdom":
            case "charisma":
                if (!scoreList.isEmpty()) { // Ensure list isn't empty before accessing
                    abilitiesMap.put(chosenAbility, scoreList.get(0)); // Always take the first element
                    scoreList.remove(0); // Remove from the front
                    abilitiesList.remove(chosenAbility); // Remove assigned ability
                } else {
                    System.out.println("No scores left to assign.");
                }
                break;
            default:
                System.out.println("Invalid ability choice. Try again.");
        }
        }
        
        return abilitiesMap;
    }
}
