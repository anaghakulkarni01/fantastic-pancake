package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        System.out.println("Calling assert true...");
        assertEquals("Hello World zzzzz!", App.greet());
    }

    @Test 
    public void test1forAdd() {
        //add add_var = new add();
        assertEquals(7, app.addnumbers(4, 3));
        assertEquals(-7, app.addnumbers(-4, -3));
        assertEquals(201, app.addnumbers(201, 0));
        assertEquals(Math.addExact(1,0), app.addnumbers(1, 0));
    }
}
