import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
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
    private final List<Recipe> recipe;
    private int id;
    private int nextRecipeId;

    /**
     * Constructor for objects of class RecipeBook
     */
    public RecipeBook()
    {
        this.author = "";
        this.id = 0;
        this.author = "";
        this.recipe = new ArrayList();
        this.nextRecipeId = 1;
        
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
     this.title = (title == null) ? "" : title;
        
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
        this.author = (author == null) ? "" : author;
    }
    public List<Recipe> getRecipes()
    {
        return recipe;
    }
    public void addRecipe(Recipe r)
    {
        if (r == null) throw new IllegalArgumentException("recipe cannot be null");
        if (r.getId() == 0) {
            r.setId(nextRecipeId++);
        }
        recipe.add(r);
    }
    public void listAll()
    {
        if (recipe.isEmpty()) {
            System.out.println("No recipes in this book.");
            return;
        }
        for (Recipe r : recipe) {
            r.printDetails();
            System.out.println("--------------");
        }
    }
    public Recipe searchByTitle(String t)
    {
        if (t == null || t.trim().isEmpty()) return null;
        String needle = t.trim();
        for (Recipe r : recipe) {
            if (r.getTitle() != null && r.getTitle().equalsIgnoreCase(t)) {
                return r;
            }
        }
        return null;
    }
    public List<Recipe> SearchByIngredient(String ingredient)
    {
        List<Recipe> result = new ArrayList<>();
        
        if (ingredient == null || ingredient.trim().isEmpty()) return result;
        String needle = ingredient.trim();
        for (Recipe r : recipe) {
            for (Ingredient ing : r.getIngredients()) {
                if (ing != null && ing. getName() != null && ing.getName().equalsIgnoreCase(needle)) {
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
    public static void main(String[] args) {
        RecipeBook book = new RecipeBook();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to the Recipe Book demo.");
        while (!exit) {
            System.out.println("\n=== Recipe Book Menu ===");
            System.out.println("1) List all recipes");
            System.out.println("2) Add a sample recipe (demo)");
            System.out.println("3) Search by title");
            System.out.println("4) Search by ingredient");
            System.out.println("5) Show top-rated recipe");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");

            String line = sc.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    book.listAll();
                    break;
                case 2:
                    // Create a small sample recipe
                    Recipe sample = new Recipe("Sample Toast", 1);
                    sample.addIngredient(new Ingredient("Bread", 1, IngredientUnit.PIECE));
                    sample.addIngredient(new Ingredient("Butter", 5, IngredientUnit.GRAM));
                    sample.addStep(new Step(1, "Toast the bread."));
                    sample.addStep(new Step(2, "Spread butter."));
                    sample.addTag(new Tag("breakfast"));
                    sample.rate(4.0);
                    book.addRecipe(sample);
                    System.out.println("Sample recipe added (id=" + sample.getId() + ").");
                    break;
                case 3:
                    System.out.print("Enter title to search: ");
                    String t = sc.nextLine().trim();
                    Recipe found = book.searchByTitle(t);
                    if (found != null) found.printDetails();
                    else System.out.println("No recipe found with that title.");
                    break;
                case 4:
                    System.out.print("Enter ingredient name to search: ");
                    String ing = sc.nextLine().trim();
                    List<Recipe> matches = book.SearchByIngredient(ing);
                    if (matches.isEmpty()) System.out.println("No recipes found with that ingredient.");
                    else {
                        System.out.println("Found " + matches.size() + " recipe(s):");
                        for (Recipe r : matches) System.out.println(" - " + r.getTitle() + " (id:" + r.getId() + ")");
                    }
                    break;
                case 5:
                    Recipe top = book.getTopRated();
                    if (top == null) System.out.println("No recipes in book.");
                    else {
                        System.out.println("Top rated recipe:");
                        top.printDetails();
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
        System.out.println("Goodbye!");
    }
}
