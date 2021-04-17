
/**
 * Write a description of interface Store here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Store
{
    int price();
    
    void setPrice(int newPrice);
    
    boolean inAssortment();
    
    String name();
    
    void printDetails();
    
    String race();
}
