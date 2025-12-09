
/**
 * Write a description of class Soup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Soup extends Recipe
{
    private String brothType;
    private boolean isSpicy;
    private int cookingTime;
     public Soup(String title, int servings, String brothType, boolean isSpicy, int cookingTime)
    {
        super(title, servings);
        this.brothType = (brothType == null) ? "" : brothType;
        this.isSpicy = isSpicy;
        this.cookingTime = Math.max(0, cookingTime);
    }
    public String getBrothType() 
    {
        return brothType;
    }
    
    public boolean getIsSpicy() 
    {
        return isSpicy;
    }
    
    public int getCookingTime() 
    {
        return cookingTime;
    }
    
    @Override
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Broth Type: " + brothType);
        System.out.println("Spicy: " + isSpicy);
        System.out.println("Cooking Time: " + cookingTime + " minutes");
    }
}
