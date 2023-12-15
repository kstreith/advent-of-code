import org.junit.Test;

import org.junit.Assert;

public class AppTest {
    @Test
    public void test_CardOne() {
        int value = App.calculateWinningNumbersForCard("Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53");

        Assert.assertEquals(4, value);
    }

    @Test
    public void test_CardTwo() {
        int value = App.calculateWinningNumbersForCard("Card 2: 13 32 20 16 61 | 61 30 68 82 17 32 24 19");

        Assert.assertEquals(2, value);
    }

    @Test
    public void test_CardThree() {
        int value = App.calculateWinningNumbersForCard("Card 3:  1 21 53 59 44 | 69 82 63 72 16 21 14  1");

        Assert.assertEquals(2, value);
    }

    @Test
    public void test_CardFour() {
        int value = App.calculateWinningNumbersForCard("Card 4: 41 92 73 84 69 | 59 84 76 51 58  5 54 83");

        Assert.assertEquals(1, value);
    }

    @Test
    public void test_CardFive() {
        int value = App.calculateWinningNumbersForCard("Card 5: 87 83 26 28 32 | 88 30 70 12 93 22 82 36");

        Assert.assertEquals(0, value);
    }

    @Test
    public void test_CardSix() {
        int value = App.calculateWinningNumbersForCard("Card 6: 31 18 13 56 72 | 74 77 10 23 35 67 36 11");

        Assert.assertEquals(0, value);
    }

    @Test
    public void test_ScoreFor0WinningCards() {
        int value = App.calculateScoreBasedUponWinningNumbers(0);

        Assert.assertEquals(0, value);
    }

    @Test
    public void test_ScoreFor1WinningCards() {
        int value = App.calculateScoreBasedUponWinningNumbers(1);

        Assert.assertEquals(1, value);
    }

    @Test
    public void test_ScoreFor2WinningCards() {
        int value = App.calculateScoreBasedUponWinningNumbers(2);

        Assert.assertEquals(2, value);
    }

    @Test
    public void test_ScoreFor4WinningCards() {
        int value = App.calculateScoreBasedUponWinningNumbers(4);

        Assert.assertEquals(8, value);
    }
    
}
