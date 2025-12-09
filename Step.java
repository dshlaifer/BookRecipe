
/**
 * Write a description of class Step here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Step
{
    
    private int stepNumber;
    private String description;


    /**
     * Constructor for objects of class Step
     */
    public Step(int stepNumber, String description)
    {
        this.stepNumber = Math.max(1, stepNumber);
        this.description = (description == null) ? "" : description;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setDescription(String description)
    {
       this.description = (description == null) ? "" : description;
    }
    public String getDescription()
    {
        return description;
    }
    public void setStepNumber(int stepNumber)
    {
        this.stepNumber = Math.max(1, stepNumber);
    }
    public int getStepNumber(){
        return stepNumber;
    }
     public String format(){
        return "Step " + stepNumber + " : " + description;
    }
   
}
