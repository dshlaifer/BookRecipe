
/**
 * Write a description of class Dinner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dinner extends Recipe
{
    private String proteinType;
    private int cookTime;
    private boolean isHealthy;
    public Dinner(String title, int servings, String proteinType, int cookTime, boolean isHealthy)
    {
        super(title, servings);
        this.proteinType = proteinType;
        this.cookTime = cookTime;
        this.isHealthy = isHealthy;
    }
    public String getProteinType() 
    {
        return proteinType;
    }
    public int getCookTime() 
    {
        return cookTime;
    }
    public boolean getIsHealthy() 
    {
        return isHealthy;
    }
    
    public void printDetails()
    {
        super.printDetails();
        System.out.println ("protein Type: " + proteinType);
        System.out.println ("Cook Time: " + cookTime + " minutes");
        System.out.println ("Healthy: " + isHealthy);
    }
}
