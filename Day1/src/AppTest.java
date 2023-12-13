import org.junit.Test;

import org.junit.Assert;

public class AppTest {
    @Test
    public void test_OnlyHasOneNum_AtEnd() {
        int value = App.calculateNumForLine("abcd3");

        Assert.assertEquals(3, value);
    }

    @Test
    public void test_OnlyHasOneNum_AtBegin() {
        int value = App.calculateNumForLine("3abcd");

        Assert.assertEquals(3, value);
    }

    @Test
    public void test_Two_Nums_Together() {
        int value = App.calculateNumForLine("ab45cd");

        Assert.assertEquals(45, value);
    }

}
