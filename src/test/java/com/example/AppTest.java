package com.example; 

import org.junit.Test; 
import static org.junit.Assert.*; 

public class AppTest { 
    @Test 
    public void testAdd() { 
        App app = new App(); 
        assertEquals(5, app.add(2, 3)); 
    }
    
    @Test
    public void testSubtract() {
        App app = new App();
        assertEquals(3, app.subtract(5, 2));
        assertEquals(-1, app.subtract(2, 3));
    }
    
    @Test
    public void testMultiply() {
        App app = new App();
        assertEquals(6, app.multiply(2, 3));
        assertEquals(0, app.multiply(5, 0));
    }
    
    @Test
    public void testDivide() {
        App app = new App();
        assertEquals(2.5, app.divide(5, 2), 0.001);
        assertEquals(2.0, app.divide(6, 3), 0.001);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        App app = new App();
        app.divide(5, 0);
    }
    
    @Test
    public void testModulus() {
        App app = new App();
        assertEquals(1, app.modulus(5, 2));
        assertEquals(0, app.modulus(6, 3));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testModulusByZero() {
        App app = new App();
        app.modulus(5, 0);
    }
}