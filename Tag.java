
/**
 * Write a description of class Tag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tag
{
    // instance variables - replace the example below with your own
    private String label;

    /**
     * Constructor for objects of class Tag
     */
    public Tag(String label)
    {
      this.label = label;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setLabel(String label)
    {
        this.label = label;
    }
    public String getLabel()
    {
        return label;
    }
    public String format()
    {
        return "#" + label;
    }
}
