import java.util.List;

/**
 * Write a description of class RecipeBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecipeBook
{
    // instance variables - replace the example below with your own
    private String title;
    private String author;
    private List<Recipe> recipe;
    private int id;

    /**
     * Constructor for objects of class RecipeBook
     */
    public RecipeBook()
    {
        this.author = author;
        id = 0;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setTitle(String title)
    {
     this.title = title;
        
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public List getRecipes()
    {
        return recipe;
    }
}
