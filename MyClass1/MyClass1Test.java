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

}
