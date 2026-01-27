import org.junit.Assert;
import org.junit.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class gradeCalCTest {
    private gradeCalc grCalculation = new gradeCalc();
    //System.out.println("grCalculation initialized");
    
/*     @BeforeEach
    void setUp(){
        grCalculation = new gradeCalc();
        System.out.println("grCalculation initialized");
    } 
 */    
    /* @AfterEach
    void tearDown() {
        grCalculation = null; // Clean up
        System.out.println("Tearing down.");
    } */

    @Test    
    @DisplayName("Tests for if else if")  

    public void testforO() {
        //gradeCalc grCalculation = new gradeCalc();
        Assert.assertEquals("O", grCalculation.grade(99));
    }
    public void testforAA() {
        //gradeCalc grCalculation = new gradeCalc();
        Assert.assertEquals("A+", grCalculation.grade(85));
    }
    public void testforA() {
        //gradeCalc grCalculation = new gradeCalc();
        Assert.assertEquals("A", grCalculation.grade(79));
    }
    public void testforB() {
        //gradeCalc grCalculation = new gradeCalc();
        Assert.assertEquals("B", grCalculation.grade(69));
    }
    public void testforC() {
        //gradeCalc grCalculation = new gradeCalc();
        Assert.assertEquals("C", grCalculation.grade(58));
    }
    public void testforD() {
        //gradeCalc grCalculation = new gradeCalc();
        Assert.assertEquals("D", grCalculation.grade(45));
    }
    public void testforFBorderCase() {
        //gradeCalc grCalculation = new gradeCalc();
        Assert.assertEquals("F", grCalculation.grade(39));
    }
    public void testforF() {
        //gradeCalc grCalculation = new gradeCalc();
        Assert.assertEquals("F", grCalculation.grade(10));
    }
    public void testforFZero() {
        //gradeCalc grCalculation = new gradeCalc();
        Assert.assertEquals("F", grCalculation.grade(0));
    }
}
