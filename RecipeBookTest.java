import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class RecipeBookTest {

    private RecipeBook myBook;
    private Recipe pancake;
    private Recipe salad;

    @BeforeEach
    public void setUp() {
        // Create RecipeBook
        myBook = new RecipeBook();
        myBook.setTitle("My Favorite Recipes");
        myBook.setAuthor("Gordon Ramsey");

        // Create first Recipe: Pancakes
        pancake = new Recipe("Pancakes", 4);
        pancake.addIngredient(new Ingredient("Flour", 2, IngredientUnit.CUP));
        pancake.addIngredient(new Ingredient("Milk", 1.5, IngredientUnit.CUP));
        pancake.addIngredient(new Ingredient("Egg", 2, IngredientUnit.PIECE));
        pancake.addStep(new Step(1, "Mix all ingredients together."));
        pancake.addStep(new Step(2, "Pour batter onto hot griddle."));
        pancake.addStep(new Step(3, "Cook until golden brown."));
        pancake.addTag(new Tag("Breakfast"));
        pancake.addTag(new Tag("Sweet"));
        pancake.setRating(4.5);
        pancake.setId(101);

        // Create second Recipe: Caesar Salad
        salad = new Recipe("Caesar Salad", 2);
        salad.addIngredient(new Ingredient("Romaine Lettuce", 1, IngredientUnit.GRAM));
        salad.addIngredient(new Ingredient("Parmesan Cheese", 0.5, IngredientUnit.CUP));
        salad.addIngredient(new Ingredient("Croutons", 1, IngredientUnit.CUP));
        salad.addStep(new Step(1, "Chop lettuce."));
        salad.addStep(new Step(2, "Add cheese and croutons."));
        salad.addStep(new Step(3, "Toss with dressing."));
        salad.addTag(new Tag("Lunch"));
        salad.addTag(new Tag("Healthy"));
        salad.setRating(4.8);
        salad.setId(102);

        // Add recipes to the book
        myBook.addRecipe(pancake);
        myBook.addRecipe(salad);
    }

    @AfterEach
    public void tearDown() {
        myBook = null;
        pancake = null;
        salad = null;
    }

    @Test
    public void testSearchByTitle() {
        Recipe found = myBook.searchByTitle("Pancakes");
        assertNotNull(found);
        assertEquals("Pancakes", found.getTitle());
    }

    @Test
    public void testSearchByIngredient() {
        List<Recipe> recipesWithMilk = myBook.SearchByIngredient("Milk");
        assertEquals(1, recipesWithMilk.size());
        assertEquals("Pancakes", recipesWithMilk.get(0).getTitle());
    }

    @Test
    public void testGetTopRated() {
        Recipe top = myBook.getTopRated();
        assertEquals("Caesar Salad", top.getTitle());
        assertEquals(4.8, top.getRating());
    }

    @Test
    public void testListAllNotEmpty() {
        List<Recipe> recipes = myBook.getRecipes();
        assertFalse(recipes.isEmpty());
        assertEquals(2, recipes.size());
    }

    @Test
    public void testScaleIngredients() {
        pancake.scale(8); // double the servings
        assertEquals(4.0, pancake.getIngredients().get(0).getQuantity()); // Flour doubled from 2 to 4
        assertEquals(3.0, pancake.getIngredients().get(1).getQuantity()); // Milk doubled from 1.5 to 3
    }

    @Test
    public void testAddTag() {
        Tag newTag = new Tag("Easy");
        pancake.addTag(newTag);
        assertTrue(pancake.getTags().contains(newTag));
    }

    @Test
    public void testSearchById() {
        Recipe found = myBook.searchByid(102);
        assertNotNull(found);
        assertEquals("Caesar Salad", found.getTitle());
    }
}

