import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {

    private Ingredient flour;

    @BeforeEach
    public void setUp() {
        // Initialize an Ingredient
        flour = new Ingredient("Flour", 2.0, IngredientUnit.CUP);
    }

    @AfterEach
    public void tearDown() {
        flour = null;
    }

    @Test
    public void testGetName() {
        assertEquals("Flour", flour.getName());
    }

    @Test
    public void testSetName() {
        flour.setName("Sugar");
        assertEquals("Sugar", flour.getName());
    }

    @Test
    public void testGetQuantity() {
        assertEquals(2.0, flour.getQuantity());
    }

    @Test
    public void testSetQuantity() {
        flour.setQuantity(3.5);
        assertEquals(3.5, flour.getQuantity());
    }

    @Test
    public void testSetUnit() {
        flour.setUnity(IngredientUnit.TEASPOON);
        // Since we only have a setter and format returns a string with unit, check the format
        assertEquals("2.0 TEASPOON of Flour", flour.format());
    }

    @Test
    public void testFormat() {
        String formatted = flour.format();
        assertEquals("2.0 CUP of Flour", formatted);
    }
}
