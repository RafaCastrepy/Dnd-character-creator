import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 
import java.util.Random;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static Scanner scanner = new Scanner(System.in); 
    static String[] classes = {"monk"};
    static String[] species = {"aasimar", "dragornborn", "dwarf", "elf", "gnome", "goliath", "halfling", "human", "orc"};
    static Map<String, Integer> abilitiesMap = new HashMap<>();
     
    static int randomAbilityScore() {
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
    static Map<String, Integer> assignScores(List<Integer> scoreList) {
        List<String> abilitiesList = new ArrayList<>(Arrays.asList("strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma"));
        boolean found = false;
        String chosenAbility = "";  // Declare outside of loop
        
        // Changed abilitiesArr from an array to a List
        
        
        // Repeat the process until a valid ability is chosen
        for (int i = 0; i < 6; i++) {
        do{
            System.out.println("the score is " + scoreList);
            System.out.println("the score is " + scoreList.get(i));
            System.out.println("Enter which ability you would like to assign this score " + abilitiesList);
            chosenAbility = scanner.nextLine().toLowerCase();
            
            found = abilitiesList.contains(chosenAbility);
            if (!found) {
                System.out.println("Invalid ability. Please select another ability to assign.");
            }
        } while (!found);
    
        
            switch (chosenAbility) {
                case "strength":
                   
                    abilitiesMap.put("strength", scoreList.get(i));
                    scoreList.remove(i);
                    abilitiesList.remove("strength");
                    break;
                case "dexterity":
              
                    abilitiesMap.put("dexterity", scoreList.get(i));
                    scoreList.remove(i);
                    abilitiesList.remove("dexterity");
                    break;
                case "constitution":
                
                    abilitiesMap.put("constitution", scoreList.get(i));
                    scoreList.remove(i);
                    abilitiesList.remove("constitution");
                    break;
                case "intelligence":
                
                    abilitiesMap.put("intelligence", scoreList.get(i));
                    scoreList.remove(i);
                    abilitiesList.remove("intelligence");
                    break;
                case "wisdom":
            
                    abilitiesMap.put("wisdom", scoreList.get(i));
                    scoreList.remove(i);
                    abilitiesList.remove("wisdom");
                    break;
                case "charisma":
    
                    abilitiesMap.put("charisma", scoreList.get(i));
                    scoreList.remove(i);
                    abilitiesList.remove("charisma");
                    break;
            }
        }
        

        System.out.println(abilitiesMap);
        return abilitiesMap;
    }
    static String chooseClass() {
        
        System.out.println("Please choose from these classes: " + Arrays.toString(classes));

        boolean found = false; 
        String chosenClass;  

        do {
            System.out.print("Enter your class: ");
            chosenClass = scanner.nextLine();  
            found = Arrays.asList(classes).contains(chosenClass.toLowerCase());

            if (!found) {
                System.out.println("Invalid class. Please choose again.");
                
            }
        } while (!found); 

        System.out.println("You have chosen " + chosenClass + "!");  

        return chosenClass;
      }

    public static void main(String[] args) {
        System.out.println("Hello, let's make a D&D 5e 2024 character!");
        

       
        System.out.print("Enter your character's name: ");
        String name = scanner.nextLine();

        chooseClass();
        List<Integer> scoresList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int abilityScore = randomAbilityScore();
            scoresList.add(abilityScore);
        }

        assignScores(scoresList);
          
        

        
        scanner.close();  
    }
}
