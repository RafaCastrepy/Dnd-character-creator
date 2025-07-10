package Dnd;
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
        
          
        

        
        scanner.close();  
    }
}
