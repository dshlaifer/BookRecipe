import java.util.List;
import java.util.ArrayList;

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
        this.id = 0;
        this.author = "";
        this.recipe = new ArrayList();
        
    }
    public static void main(String[] args) {
    System.out.println("this is my menu");
    System.out.println(args[0]);
    System.out.println(args[1]);
    
    boolean exit = false;
    int choice = 1;

    switch (choice) {
        case 1:
            System.out.println("Option 1 selected");
            break;

        case 2:
            System.out.println("Option 2 selected");
            break;

        case 3:
            System.out.println("Option 3 selected");
            break;

        case 0:
            System.out.println("Exiting...");
            exit = true;
            break;

        default:
            System.out.println("Invalid option");
            break;
    }
}


    public void setId(int id) {
        this.id = id;
    }
    
    public int getId()
    {
        return id;
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
    public void addRecipe(Recipe r)
    {
        recipe.add(r);
    }
    public void listAll()
    {
        for (Recipe r : recipe) {
            r.printDetails();
            System.out.println("--------------");
        }
    }
    public Recipe searchByTitle(String t)
    {
        for (Recipe r : recipe) {
            if (r.getTitle().equalsIgnoreCase(t)) {
                return r;
            }
        }
        return null;
    }
    public List<Recipe> SearchByIngredient(String ingredient)
    {
        List<Recipe> result = new ArrayList<>();
        
        for (Recipe r : recipe) {
            for (Ingredient ing : r.getIngredients()) {
                if (ing. getName().equalsIgnoreCase(ingredient)) {
                    result.add(r);
                    break;
                }
            }
        }
        return result;
    }
    
    public Recipe searchByid(int id)
    {
        for (Recipe r : recipe) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }
    public Recipe getTopRated()
    {
        if (recipe.isEmpty())
        {
            return null;
        }
        Recipe best = recipe.get(0);
        
        for (Recipe r : recipe) {
            if (r.getRating() > best.getRating()) {
                best = r;
            }
        }
        return best;
    }
}
