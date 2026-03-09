package firstmaven;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    App app = new App();

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testGreet(){
        assertNotEquals("Hello World", app.greet());
    }
}
