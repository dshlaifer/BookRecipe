import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{
    // instance variables - replace the example below with your own
    private String title;
    private int servings;
    private List<Ingredient> ingredients;
    private List<Step> steps;
    private List<Tag> tags;
    private double rating;
    private int id;

    /**
     * Constructor for objects of class Recipe
     */
    public Recipe(String title, int servings)
    {
        this.title = title;
        this.servings = servings;
        this.ingredients = new ArrayList<>();
        this.steps = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.rating = 0.0;
        this.id = 0;
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
    public void setServings(int servings)
    {
      this.servings = servings;
    }
    public List<Ingredient> getIngredients()
    {
      return ingredients;
    }
    public List<Step> getSteps()
    {
      return steps;
    }
        public List<Tag> getTags()
    {
      return tags;
    }
    public void setRating( double Rating)
    {
        this.rating = rating;
    }
        public double getRating()
    {
      return rating;
    }
    public void addRating(double r)
    {
        this.rating = r;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    
    public void scale(int newServings)
    {
        if (newServings <= 0)
        return;
        
        double factor = (double)newServings / servings;
        
        for (Ingredient i : ingredients)
        {
            i.setQuantity(i.getQuantity() * factor);
        }
        servings = newServings;
    }
    
    public void addIngredient( Ingredient ingredient)
    {
        ingredients.add(ingredient);
    }
    public void addStep(Step step)
    {
        steps.add(step);
    }
    public void addTag(Tag tag)
    {
        tags.add(tag);
    }
    
    public void printDetails()
    {
        System.out.println("Recipe: " + title);
        System.out.println("Servings: " + servings);
        System.out.println("Rating: " + rating);
        System.out.println("\nIngredients:");
        for (Ingredient i : ingredients)
        {
            System.out.println(" - " + i.format());
        }
        
        System.out.println("\nSteps:");
        for (Step s : steps)
        {
            System.out.println(s.format());
        }
        
        System.out.println("\nTags:");
        for (Tag t : tags)
        {
            System.out.println(" #" + t.getLabel());
        }
    }
}
