import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class gradeCalCTest {
    gradeCalc grCalculation = new gradeCalc();
    @Test    
    @DisplayName("Tests for if else if")  

    public void testAll() {
        testforO();
        testforAA();
        testforA();
        testforB();
        testforC();
        testforD();
        testforF();
        testforFBorderCase();
        testforFZero();
    }
    
    public void testforO() {
        Assert.assertEquals("O", grCalculation.grade(99));
        System.out.println("Grade O...");
    }
    public void testforAA() {
        Assert.assertEquals("A+", grCalculation.grade(85));
        System.out.println("Grade A+");
    }
    public void testforA() {
        Assert.assertEquals("A", grCalculation.grade(79));
        System.out.println("Grade A");
    }
    public void testforB() {
        Assert.assertEquals("B", grCalculation.grade(69));
        System.out.println("Grade B");
    }
    public void testforC() {
        Assert.assertEquals("C", grCalculation.grade(58));
        System.out.println("Grade C");
    }
    public void testforD() {
        Assert.assertEquals("D", grCalculation.grade(45));
        System.out.println("Grade D");
    }
    public void testforFBorderCase() {
        Assert.assertEquals("F", grCalculation.grade(39));
        System.out.println("Grade F Border Case");
    }
    public void testforF() {
         Assert.assertEquals("F", grCalculation.grade(10));
        System.out.println("Grade F");
    }
    public void testforFZero() {
        Assert.assertEquals("F", grCalculation.grade(0));
        System.out.println("Grade F for Zero ...");
    }
}
