import org.junit.Test;

import org.junit.Assert;

public class AppTest {
    @Test
    public void test_One() {
        int value = App.calculateNumForLine("1abc2");

        Assert.assertEquals(12, value);
    }

    @Test
    public void test_Two() {
        int value = App.calculateNumForLine("pqr3stu8vwx");

        Assert.assertEquals(38, value);
    }
 
    @Test
    public void test_Three() {
        int value = App.calculateNumForLine("a1b2c3d4e5f");

        Assert.assertEquals(15, value);
    }

    @Test
    public void test_Four() {
        int value = App.calculateNumForLine("treb7uchet");

        Assert.assertEquals(77, value);
    }

}
