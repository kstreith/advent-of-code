import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static int calculateWinningNumbersForCard(String input) {
            int winningNumbers = 0;
            return winningNumbers;
    }
    public static int calculateScoreBasedUponWinningNumbers(int winningNumbers) {
            int score = 0;
            return score;
    }
    public static void runOverDataFile() throws IOException
    {
        Path dataPath = Paths.get("Data.txt");
        List<String> lines = Files.readAllLines(dataPath, StandardCharsets.UTF_8);
        int sum = 0;
        for (String line: lines) {
            int valForLine = calculateWinningNumbersForCard(line);
            sum += valForLine;
        }
        System.out.println("Sum is " + sum);
    }
    public static void quickTest() {
        String card = "Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53";
        int winningNumbers = calculateWinningNumbersForCard(card);
        System.out.println("Winning numbers of " + winningNumbers + " for card " + card);
        int score = calculateScoreBasedUponWinningNumbers(winningNumbers);
        System.out.println("Score for above card is " + score);
    }
    public static void main(String[] args) throws Exception {
        quickTest();
        //runOverDataFile();
    }
}

