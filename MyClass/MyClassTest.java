import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    private MyClass myClass = new MyClass();

    @Test
    public void testAdd() {
        assertEquals(5, myClass.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, myClass.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, myClass.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, myClass.divide(10.0, 5.0), 0.001);
    }

    @Test
    public void testConcatenateStrings() {
        assertEquals("Hello, World", myClass.concatenateStrings("Hello, ", "World"));
    }

    @Test
    public void testIsEven() {
        assertTrue(myClass.isEven(4));
        assertFalse(myClass.isEven(7));
    }

    @Test
    public void testIsPrime() {
        assertTrue(myClass.isPrime(2));
        assertTrue(myClass.isPrime(7));
        assertFalse(myClass.isPrime(4));
    }
}
