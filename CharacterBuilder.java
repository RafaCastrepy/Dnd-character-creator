package Dnd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 
import java.util.Random;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public abstract class CharacterBuilder {
    public enum ClassType{
		BARBARIAN,
        BARD,
        CLERIC,
        DRUID,
        FIGHTER,
        MONK,
        PALADIN,
        RANGER,
        ROGUE,
        SORCERER,
        WARLOCK,
        WIZARD,
	}
    private String name;
    private Race race;
    private String background;
    private Map<String, Integer>abilitiesMap;
    private List<Item> inventory;
    private List<Spell> spells;
    private ClassType classType;
    public CharacterBuilder(String name, Race race, String background, Map<String, Integer>abilitiesMap, List<Item> inventory, ClassType classType){
        this.name = name;
        this.race=race;
        this.background=background;
        this.abilitiesMap=abilitiesMap;
        this.inventory=inventory;
        this.classType=classType;
    }
    public void setAbilities(Map<String, Integer> abilitiesMap){
        this.abilitiesMap=abilitiesMap;
    }
    
    public Map<String, Integer> getAbilities(){
        return abilitiesMap;
    }
    
    public void pickupItem(Item item){
        inventory.add(item);
    }

    public Item dropItem(Item item){
        return this.item;
    }
}

