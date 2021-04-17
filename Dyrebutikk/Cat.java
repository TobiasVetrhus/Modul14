
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Animal
{
    
    public Cat(String name, String race, String dateOfBirth, int price)
    {
        super(name, race, dateOfBirth, price);
        if(name == null){
            name = "";
        }
        if(race == null){
            race = "";
        }
        if(dateOfBirth == null){
            dateOfBirth = "";
        }

        if(name.isEmpty() || race.isEmpty() || dateOfBirth.isEmpty() || price < 0){
            throw new IllegalStateException("One or more of the parameters are blank.. Assign a proper value");
        }
    }
    
    public void makeNoise()
    {
        System.out.println("Meow!");
    }
}
