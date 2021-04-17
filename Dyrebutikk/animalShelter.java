import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
/**
 * Write a description of class Dyrebutikk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class animalShelter
{
    private static final String STORENAME = "Vennesla Animal Shelter";
    private static final String ADDRESS = "Lerkevegen 2";
    private HashMap<String, Animal> animalMap;

    public animalShelter()
    {
        animalMap = new HashMap<>();

    }

    public void addAnimal(String raceID, Animal animal)
    {
        try {
            if(raceID == null || raceID.trim().length() == 0){
                throw new IllegalArgumentException("null is not an excepted value. Enter a raceID");
            } else {
                animalMap.put(raceID, animal);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("parameter 'raceID' was empty, or null");
        }
    }

    public boolean raceIDinUse(String raceID)
    {
        return animalMap.containsKey(raceID);
    }

    public void printAnimal(String raceID)
    {
        try {
            if(raceID == null || raceID.trim().length() == 0){
                throw new IllegalArgumentException("null is not an excepted value. Enter a raceID");
            } else {
                Animal animal = animalMap.get(raceID);
                System.out.println(animal.getDetails());
            } 
        } catch(IllegalArgumentException e){
            System.out.println("parameter 'raceID' was empty, or null");
        }
        assert raceIDinUse(raceID);
    }

    public void printAllAnimals()
    {
        for(String raceID : animalMap.keySet()){
            Animal animal = animalMap.get(raceID);
            System.out.println(animal.getDetails());        
        }
    }

    public void printPerPrice(int price)
    {
        for(String raceID : animalMap.keySet()){
            Animal animal = animalMap.get(raceID);
            if(animal.getPrice() >= price){
                System.out.println(animal.getDetails());
            } else {
                System.out.println("Found no animal");
            }
        }
    }

    public void removeAnimal(String raceID)
    {
        try {
            if(raceID == null || raceID.trim().length() == 0){
                throw new IllegalArgumentException("null is not an excepted value. Enter a raceID");
            } else {
                Animal animals = animalMap.get(raceID);
                animalMap.remove(raceID);
            }
        } catch (IllegalArgumentException e){
            System.out.println("parameter 'raceID' was empty, or null");            
        }
        assert !raceIDinUse(raceID);
    }

    public boolean createFile(String filename)
    {
        boolean success = false;
        try {
            FileWriter writer = new FileWriter(filename);            
        for(String raceID : animalMap.keySet()){
            Animal animal = animalMap.get(raceID);
            writer.write(animal.getDetails());   
            writer.write("\n");
        }
            writer.close();
            success = true;
        } catch(IOException e) {
            System.err.println("There was a problem writing to " + filename);
        }
        return success;
    }
}

