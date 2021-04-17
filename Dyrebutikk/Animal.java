
public class Animal 
{
    private String name;
    private String race;
    private String dateOfBirth;
    private int price;

    public Animal(String name, String race, String dateOfBirth, int price)
    {
        this.name = name;
        this.race = race;
        this.dateOfBirth = dateOfBirth;
        this.price = price;
    }

    public String getDetails()
    {
        return "Animal's name: " + name + "   Race: " + race + "   Date of birth: " + dateOfBirth + "   Price: " + price;
    }

    public int getPrice()
    {
        return price;
    }

    public boolean equals(Object obj)
    {
        if(this == obj) {
            return true; //reference equality.
        }
        if (!(obj instanceof Animal)) {
            return false; //Not the same type.
        }
        //Gain access to other laptop's fields.
        Animal other = (Animal) obj;
        return name.equals(other.name) && price == other.price && dateOfBirth.equals(other.dateOfBirth) && race.equals(other.race);
    }

    public int hashCode()
    {
        int result = 17;
        result = 37 * result + price;
        result = 37 * result + name.hashCode();
        result = 37 * result + race.hashCode();
        result = 37 * result + dateOfBirth.hashCode(); 
        return result;
    }
}
