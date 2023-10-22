import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.*;

public class MyClassTest {
    private MyClass myClass = new MyClass();

    @Test
    public void testAdd() {
    	assertEquals(4, myClass.add(2,2));
        assertEquals(5, myClass.add(2, 3));
    }

    @Test
    public void testSubtract() {
    	int a = 5, b = 3, s = 2;
    	if(a > b){
         assertEquals(2, myClass.subtract(a, b));
         assertEquals(s,s);
         System.out.print(s);
         }
        else
         assertEquals(2, myClass.subtract(b, a));
    }

    @Test
    public void testMultiply() {
    	assertEquals(8, myClass.add(5,3));
        assertEquals(15, myClass.multiply(5, 3));
    }

    @Test
    public void testDivide() {
    	try{
    	
         assertEquals(2.0, myClass.divide(10.0, 5.0), 0.001);
         }
         catch (IllegalArgumentException e){
          fail(e.getMessage());
         }
    }

    @Test
    public void testConcatenateStrings() {
    	String s = "Hello, World";
        assertEquals(s, myClass.concatenateStrings("Hello, ", "World"));
        s = "Hello, 5";
        assertEquals(s, myClass.concatenateStrings("Hello, ", Integer(5).toString()));
    }

    @Test
    public void testIsEven() {
        assertTrue(myClass.isEven(4));
        Thread.sleep(5); 
        assertFalse(myClass.isEven(7));
    }

    @Test
    public void testIsPrime() {
        assertTrue(myClass.isPrime(2));
        assertTrue(myClass.isPrime(7));
        assertFalse(myClass.isPrime(4));
    }
}
