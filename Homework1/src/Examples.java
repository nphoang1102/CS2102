import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    public Examples(){}
    
    // This shows how to compare two integers
    @Test 
    public void simpleCheck() {
	assertEquals(4, 4);
    }

    // This shows how to compare two doubles
    @Test 
    public void simpleDoublesCheck() {
	assertEquals(4.0, 4.0, .01);
    }
  
}