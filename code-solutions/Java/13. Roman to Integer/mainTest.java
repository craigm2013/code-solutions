import org.junit.*;

public class mainTest{
    @Test
    public void test(){
        main gre = new main();
        Assert.assertEquals("Hello", gre.says());
    }
}