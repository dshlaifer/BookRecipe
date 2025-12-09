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
    private final List<Ingredient> ingredients;
    private final List<Step> steps;
    private final List<Tag> tags;
    private int ratingCount;
    private double rating;
    private int id;

    /**
     * Constructor for objects of class Recipe
     */
    public Recipe(String title, int servings)
    {
        this.title = (title == null) ? "" : title;
        this.servings = Math.max(1, servings);
        this.ingredients = new ArrayList<>();
        this.steps = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.rating = 0.0;
        this.ratingCount = 0;
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
      this.title = (title == null) ? "" : title;
    }
    public String getTitle()
    {
        return title;
    }
    public void setServings(int servings)
    {
        if (servings > 0) {
      this.servings = servings;
    }
    }
    public int getServings() {
        return servings;
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
        if (rating >= 0.0) {
            this.rating = rating;
            this.ratingCount = (rating > 0.0) ? 1 : 0;
        }
    }
        public double getRating()
    {
      return rating;
    }
    public int getRatingCount() {
        return ratingCount; 
    }
    public void rate(double r) {
        if (r < 0.0) return;
        this.rating = (this.rating * this.ratingCount + r) / (this.ratingCount + 1);
        this.ratingCount++;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void addRating(double newRating) {
        if (newRating < 0 || newRating > 5) {
            System.out.println("Rating must be between 0 and 5.");
            return;
        }
        rating = (rating * ratingCount + newRating) / (ratingCount + 1);
        ratingCount++;
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
        if (ingredient == null) return;
        ingredients.add(ingredient);
    }
    public void addStep(Step step)
    {
        if (step == null) return;
        steps.add(step);
    }
    public void addTag(Tag tag)
    {
        if (tag == null) return;
        tags.add(tag);
    }
        public void printDetails() {
        System.out.println("Recipe: " + title + (id != 0 ? " (id:" + id + ")" : ""));
        System.out.println("Servings: " + servings);
        System.out.printf("Rating: %.2f (%d rating%s)%n", rating, ratingCount, (ratingCount==1?"":"s"));
        System.out.println("\nIngredients:");
        if (ingredients.isEmpty()) {
            System.out.println("  (none)");
        } else {
            for (Ingredient i : ingredients) {
                System.out.println(" - " + (i == null ? "(null ingredient)" : i.format()));
            }
        }

        System.out.println("\nSteps:");
        if (steps.isEmpty()) {
            System.out.println("  (none)");
        } else {
            for (Step s : steps) {
                System.out.println(s.format());
            }
        }

        System.out.println("\nTags:");
        if (tags.isEmpty()) {
            System.out.println("  (none)");
        } else {
            for (Tag t : tags) {
                System.out.println(" " + (t == null ? "(null tag)" : t.format()));
            }
        }
    }
    

}
