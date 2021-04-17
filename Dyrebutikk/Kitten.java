
/**
 * Write a description of class Kitten here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kitten implements Mammal, Store
{
    //Mammal interface
    private String habitat;
    private String race;
    private int weight;
    private boolean canFly;

    //Store interface
    private String name;
    private int price;
    private boolean inAssortment;

    public Kitten(String habitat, String race, int weight, boolean canFly, String name, int price, boolean inAssortment)
    {
        this.habitat = habitat;
        this.race = race;
        this.weight = weight;
        this.canFly = canFly;
        this.name = name;
        this.price = price;
        this.inAssortment = inAssortment;
    }

    public String habitat()
    {
        return habitat;
    }

    public String race()
    {
        return race;
    }

    public int weight()
    {
        return weight;
    }

    public void setWeight(int kgs)
    {
        if(weight > 0){
            weight = kgs;
        } else {
            System.out.println("Animal weight invalid, try a weight bigger than 0");
        }
    }
    
    public boolean canFly()
    {
        return canFly;
    }
    
    public String name()
    {
        return name;
    }
    
    public int price()
    {
        return price;
    }
    
    public void setPrice(int newPrice)
    {
        if(newPrice >= 0){
            price = newPrice;
        } else {
            System.out.println("Please choose a positive number");
        }
    }
    
    public boolean inAssortment()
    {
        return inAssortment;
    }
    
    public void printDetails()
    {
        System.out.println("Details of " + name + ": ");
        System.out.println("--------------------------------");
        System.out.println("Price: " + price + "kr" + "\n" + "Race: " + race);
        if(inAssortment == true){
            System.out.println("In Assortment: 'Yes'");
        }
        System.out.println("Preffered Habitat: " + habitat + "\n" + "Weight: " + weight);
        System.out.println();
    }
    
    public void makeNoise()
    {
        System.out.println("meow");
    }
}
