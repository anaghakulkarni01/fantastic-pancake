import org. junit.*;
public class subtractTest {
    @Test 
    public void test1forsubtract() {
        subtract sub_var = new subtract();
        Assert.assertEquals(7, sub_var.subtract(4, 3));
        Assert.assertEquals(-1, sub_var.subtract(-4, -3));
        Assert.assertEquals(201, sub_var.subtract(201, 0));
        Assert.assertEquals(Math.subtractExact(1,0), sub_var.subtract(1, 0));
    }
}
