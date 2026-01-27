
import org.junit.*;

public class addTest {
    @Test 
    public void test1forAdd() {
        add add_var = new add();
        Assert.assertEquals(7, add_var.addnumbers(4, 3));
        Assert.assertEquals(-7, add_var.addnumbers(-4, -3));
        Assert.assertEquals(201, add_var.addnumbers(201, 0));
        Assert.assertEquals(Math.addExact(1,0), add_var.addnumbers(1, 0));
    }
}
