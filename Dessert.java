
/**
 * Write a description of class Dessert here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dessert extends Recipe
{
    private int sweetnessLevel;
    private boolean isFrozen;
    private int calories;

    /**
     * Constructor for objects of class Dessert
     */
    public Dessert(String title, int servings, int sweetnessLevel, boolean isFrozen, int calories)
    {
        super(title, servings);
        this.sweetnessLevel = Math.max(0, Math.min(10, sweetnessLevel));
        this.isFrozen = isFrozen;
        this.calories = Math.max(0, calories);
    }
    public int getSweetnessLevel()
    {
        return sweetnessLevel;
    }
    public boolean getIsFrozen()
    {
        return isFrozen;
    }
    public int getCalories()
    {
        return calories;
    }
    
    @Override
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Sweetness Level: " + sweetnessLevel);
        System.out.println("Frozen: " + isFrozen);
        System.out.println("Calories: " + calories);
    }
    

}
