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
    static Scanner scanner = new Scanner(System.in);
    public Abilities(Map<String, Integer>abilitiesMap){
    this.abilitiesMap=abilitiesMap;
    }
    public void fillAbilities(){
        List<Integer> scoresList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int abilityScore = randomAbilityScore();
            scoresList.add(abilityScore);
        }
        assignScores(scoresList);
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
        String chosenAbility = "";
        Integer target = null;

        for (int i = 0; i < 6; i++) {
            boolean validInput = false;

            while (!validInput) {
                System.out.println("Your scores are: " + scoreList);
                System.out.println("Choose a score to assign:");

                try {
                    target = Integer.parseInt(scanner.nextLine());
                    if (!scoreList.contains(target)) {
                        System.out.println("That score is not in the list. Try again.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                    continue;
                }

                System.out.println("Enter which ability to assign this score to " + abilitiesList + ":");
                chosenAbility = scanner.nextLine().toLowerCase();

                if (!abilitiesList.contains(chosenAbility)) {
                    System.out.println("Invalid ability. Try again.");
                    continue;
                }

                // Only reach here if both inputs are valid
                validInput = true;
            }

            // Assign and remove after validation
            abilitiesMap.put(chosenAbility, target);
            scoreList.remove((Integer) target); // removes first occurrence only
            abilitiesList.remove(chosenAbility);
        }

        return abilitiesMap;
}

}
