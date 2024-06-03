import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest{
    App testObject = new App();
    @Test
    public void testPrimes(){
        assertEquals(true, testObject.isPrime(3));
        assertEquals(true, testObject.isPrime(7));
        assertEquals(false, testObject.isPrime(12321 ));
        assertEquals(true, testObject.isPrime(101 ));
        assertEquals(false, testObject.isPrime(15));
        assertEquals(true, testObject.isPrime(11));
        assertEquals(false, testObject.isPrime(9));
    }
    @Test
    public void testPalindrome(){
        assertEquals(true, testObject.isPalindrome(101 ));
        assertEquals(true, testObject.isPalindrome(12321 ));
    }

    @Test
    public void case1(){
        assertEquals(101, testObject.primePalindrome(13));
        assertEquals(17971, testObject.primePalindrome(17472));
    }
}