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
    public CharacterBuilder(String name, Race race, String background, Map<String, Integer>abilitiesMap, List<Item> inventory){
        this.name = name;
        this.race=race;
        this.background=background;



    }
}
