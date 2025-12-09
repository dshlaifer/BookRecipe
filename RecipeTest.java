import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    private Recipe recipe;

    @BeforeEach
    public void setUp() {
        recipe = new Recipe("Pancakes", 4);
    }

    @AfterEach
    public void tearDown() {
        recipe = null;
    }

    @Test
    public void testConstructorInitialValues() {
        assertEquals("Pancakes", recipe.getTitle());
        assertTrue(recipe.getIngredients().isEmpty());
        assertTrue(recipe.getSteps().isEmpty());
        assertTrue(recipe.getTags().isEmpty());
        assertEquals(0.0, recipe.getRating());
        assertEquals(0, recipe.getId());
    }

    @Test
    public void testSetTitle() {
        recipe.setTitle("Waffles");
        assertEquals("Waffles", recipe.getTitle());
    }

    @Test
    public void testAddIngredient() {
        Ingredient ing = new Ingredient("Flour", 2, IngredientUnit.CUP);
        recipe.addIngredient(ing);

        assertEquals(1, recipe.getIngredients().size());
        assertEquals("Flour", recipe.getIngredients().get(0).getName());
    }

    @Test
    public void testAddStep() {
        Step s = new Step(1, "Mix ingredients");
        recipe.addStep(s);

        assertEquals(1, recipe.getSteps().size());
        assertEquals("Mix ingredients", recipe.getSteps().get(0).getDescription());
    }

    @Test
    public void testAddTag() {
        Tag t = new Tag("Breakfast");
        recipe.addTag(t);

        assertEquals(1, recipe.getTags().size());
        assertEquals("Breakfast", recipe.getTags().get(0).getLabel());
    }

    @Test
    public void testAddRating() {
        recipe.addRating(4.7);
        assertEquals(4.7, recipe.getRating(), 0.0001);
    }

    @Test
    public void testSetId() {
        recipe.setId(123);
        assertEquals(123, recipe.getId());
    }

    @Test
    public void testScaleIngredients() {
        // Add ingredients first
        Ingredient flour = new Ingredient("Flour", 2.0, IngredientUnit.CUP);
        Ingredient milk = new Ingredient("Milk", 1.5, IngredientUnit.CUP);

        recipe.addIngredient(flour);
        recipe.addIngredient(milk);

        recipe.scale(8);

        assertEquals(4.0, recipe.getIngredients().get(0).getQuantity());  // 2 → 4
        assertEquals(3.0, recipe.getIngredients().get(1).getQuantity());  // 1.5 → 3
    }

    @Test
    public void testScaleInvalidValue() {
        Ingredient ing = new Ingredient("Water", 1.0, IngredientUnit.CUP);
        recipe.addIngredient(ing);

        recipe.scale(0);

        assertEquals(1.0, recipe.getIngredients().get(0).getQuantity());
    }
}
