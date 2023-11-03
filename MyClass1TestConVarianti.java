import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.*;

public class MyClass1Test {
    private MyClass1 myClass = new MyClass1();

    @Test
    public void testUnico() {
    	int a = 4, b = 5, s = 9, p = 20;
    	
    	assertEquals(s, myClass.add(b,a));
        
        assertEquals(p, myClass.multiply(a, b));
        
        assertTrue(myClass.isEven(b));
    }

//rifattorizzazioni non valide:
/*
//scambio multiply-divide
    @Test
    public void testUnico() {
    	int a = 4, b = 5, s = 9, p = 20;
    	
    	assertEquals(s, myClass.add(b,a));
        
        assertEquals(p, myClass.divide(a, b));
        
        assertTrue(myClass.isEven(b));
    }


//tolto add
    @Test
    public void testUnico() {
    	int a = 4, b = 5, s = 9, p = 20;
    	
    	//assertEquals(s, myClass.add(b,a));
        
        assertEquals(p, myClass.multiply(a, b));
        
        assertTrue(myClass.isEven(b));
    }


//tolto multiply
    @Test
    public void testUnico() {
    	int a = 4, b = 5, s = 9, p = 20;
    	
    	assertEquals(s, myClass.add(b,a));
        
        //assertEquals(p, myClass.multiply(a, b));
        
        assertTrue(myClass.isEven(b));
    }


//tolto isEven
    @Test
    public void testUnico() {
    	int a = 4, b = 5, s = 9, p = 20;
    	
    	assertEquals(s, myClass.add(b,a));
        
        assertEquals(p, myClass.multiply(a, b));
        
        //assertTrue(myClass.isEven(b));
    }


//scambio isEven-isPrime
    @Test
    public void testUnico() {
    	int a = 4, b = 5, s = 9, p = 20;
    	
    	assertEquals(s, myClass.add(b,a));
        
        assertEquals(p, myClass.multiply(a, b));
        
        assertTrue(myClass.isPrime(b));
    }

//scambio add-subtract
    @Test
    public void testUnico() {
    	int a = 4, b = 5, s = 9, p = 20;
    	
    	assertEquals(s, myClass.subtract(b,a));
        
        assertEquals(p, myClass.multiply(a, b));
        
        assertTrue(myClass.isEven(b));
    }


*/
}
