import org.junit.Test;

import org.junit.Assert;

public class AppTest {
    @Test
    public void test_OnlyHasOneNum_AtEnd() {
        int value = App.calculateNumForLine("abcd3");

        Assert.assertEquals(33, value);
    }

    @Test
    public void test_OnlyHasOneNum_AtBegin() {
        int value = App.calculateNumForLine("3abcd");

        Assert.assertEquals(33, value);
    }

    @Test
    public void test_Two_Nums_Together() {
        int value = App.calculateNumForLine("ab45cd");

        Assert.assertEquals(45, value);
    }

    @Test
    public void test_One_Num_Twice() {
        int value = App.calculateNumForLine("ab4cdef4");

        Assert.assertEquals(44, value);
    }

    @Test
    public void test_More_Than_Two_Num() {
        int value = App.calculateNumForLine("a8b4c5f6");

        Assert.assertEquals(86, value);
    }

}
