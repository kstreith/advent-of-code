import org.junit.Test;

import org.junit.Assert;

public class AppTest {
    @Test
    public void testDostuff() {
        int value = App.dostuff(3);

        Assert.assertEquals(9, value);
    }
}
