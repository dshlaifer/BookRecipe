

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TagTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TagTest
{
    private Tag tag1;
    private Tag tag2;
    /**
     * Default constructor for test class TagTest
     */
    public TagTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        tag1 = new Tag("Italian");
        tag2 = new Tag("Dessert");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    @Test
    public void testGetLabel()
    {
        assertEquals("Italian", tag1.getLabel());
        assertEquals("Dessert", tag2.getLabel());
    }
    @Test
    public void testFormat()
    {
        assertEquals("#Italian", tag1.format());
    }
}