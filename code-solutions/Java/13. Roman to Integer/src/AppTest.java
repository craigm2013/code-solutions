import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    App testObject= new App();
    @Test
    public void case1(){
        assertEquals(3, testObject.romanToInt("III"));
    }
    @Test
    public void case2(){
        assertEquals(58, testObject.romanToInt("LVIII"));
    }
    @Test
    public void case3(){
        assertEquals(1994, testObject.romanToInt("MCMXCIV"));
    }

    @Test
    public void cases(){
        assertEquals(1, testObject.romanToInt("I"));
        assertEquals(3, testObject.romanToInt("III"));
        assertEquals(4, testObject.romanToInt("IV"));
        assertEquals(6, testObject.romanToInt("VI"));
        assertEquals(7, testObject.romanToInt("VII"));
        assertEquals(11, testObject.romanToInt("XI"));
        assertEquals(10, testObject.romanToInt("X"));
        assertEquals(9, testObject.romanToInt("IX"));
        assertEquals(49, testObject.romanToInt("IL"));
        assertEquals(21, testObject.romanToInt("XXI"));
        assertEquals(22, testObject.romanToInt("XXII"));
        assertEquals(67, testObject.romanToInt("LXVII"));
    }
}

