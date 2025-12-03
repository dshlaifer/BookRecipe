import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StepTest
{
    private Step step1;
    private Step step2;

    @Before
    public void setUp()
    {
        step1 = new Step(1, "Mix ingredients");
        step2 = new Step(2, "Bake");
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testFormat()
    {
        assertEquals("1. Mix ingredients", step1.format());
        assertEquals("2. Bake", step2.format());
    }

    @Test
    public void testSetDescription()
    {
        step2.setDescription("Bake for 30 minutes");
        assertEquals("Bake for 30 minutes", step2.getDescription());
    }
}
