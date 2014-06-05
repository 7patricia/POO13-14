

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ComparatorDataTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ComparatorDataTest
{
    /**
     * Default constructor for test class ComparatorDataTest
     */
    public ComparatorDataTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void datas()
    {
        ComparatorData comparat1 = new ComparatorData();
        assertEquals(-1, comparat1.compare("24-Jun-2004", "25-Jun-2004"));
    }

    @Test
    public void datas2()
    {
        ComparatorData comparat2 = new ComparatorData();
        assertEquals(0, comparat2.compare("24-Mai-2000", "24-Mai-2000"));
    }
}


