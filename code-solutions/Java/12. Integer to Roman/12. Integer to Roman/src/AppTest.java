import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    App testObject= new App();
    @Test
    public void case1(){
        assertEquals("MMMDCCXLIX", testObject.intToRoman(3749));
    }
    @Test
    public void case2(){
        assertEquals("MCMXCIV", testObject.intToRoman(1994));
    }
    @Test
    public void case3(){
        assertEquals("LVIII", testObject.intToRoman(58));
    }

    @Test
    public void subtractiveForm(){
        assertEquals(4, testObject.subtractiveForm("IIII"));
        assertEquals(4, testObject.subtractiveForm("VIIII"));
        assertEquals(4, testObject.subtractiveForm("XVIIII"));
        assertEquals(2, testObject.subtractiveForm("XVII"));
        assertEquals(3, testObject.subtractiveForm("XVIII"));
    }
    @Test
    public void subtractiveForm2(){
        assertEquals(3, testObject.subtractiveForm("VIII"));
    }


    @Test
    public void testIntToRoman() {
        assertEquals("I", testObject.intToRoman(1));
        assertEquals("III", testObject.intToRoman(3));
        assertEquals("V", testObject.intToRoman(5));
        assertEquals("L", testObject.intToRoman(50));
        assertEquals("MMDCCXXIII", testObject.intToRoman(2723));
        assertEquals("CD", testObject.intToRoman(400));
        assertEquals("IV", testObject.intToRoman(4));


  
  
  
    }
}

