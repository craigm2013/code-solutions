import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest{
    App testObject = new App();
    @Test
    public void testPrimes(){
        assertEquals(true, testObject.isPrime(3));
    }
}