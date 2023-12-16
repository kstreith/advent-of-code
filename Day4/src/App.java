import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static int calculateWinningNumbersForCard(String input) {
            String[] winningNumbers = input.substring(input.indexOf(":")+1, input.indexOf("|")).split(" ");//"Card   1: 66 90 67 76 55 13 91 31 95  4 | 82 98 69  8 15  2 32 24 99 56 46 65 60 72 58 68 54 22 26  5 74 25 84 73 61".split(" ");
            //System.out.println("1");
            /*int[] winningNumbers = {0, 1, 2, 3, 4};
            winningNumbers[0] = Integer.parseInt(input.substring(8, 10).trim());
            winningNumbers[1] = Integer.parseInt(input.substring(11,13).trim());
            winningNumbers[2] = Integer.parseInt(input.substring(14,16).trim());
            winningNumbers[3] = Integer.parseInt(input.substring(17, 19).trim());
            winningNumbers[4] = Integer.parseInt(input.substring(20,22).trim());*/

            String[] cardNumbers = input.substring(input.indexOf("|")+2).split(" ");
            
            /*cardNumbers[0] = Integer.parseInt(input.substring(25, 27).trim());
            cardNumbers[1] = Integer.parseInt(input.substring(28,30).trim());
            cardNumbers[2] = Integer.parseInt(input.substring(31,33).trim());
            cardNumbers[3] = Integer.parseInt(input.substring(34, 36).trim());
            cardNumbers[4] = Integer.parseInt(input.substring(37,39).trim());
            cardNumbers[5] = Integer.parseInt(input.substring(40,42).trim());
            cardNumbers[6] = Integer.parseInt(input.substring(43,45).trim());
            cardNumbers[7] = Integer.parseInt(input.substring(46,48).trim());*/
            
            int y = 0;
            int countOfMatchingWinners = 0;
            for (int x = 0; x < (winningNumbers.length); x++){
                if (winningNumbers[x].trim().equals("")) {
                    continue;
                }
                while(y < (cardNumbers.length)){
                    if (winningNumbers[x].trim().equals(cardNumbers[y].trim())){
                        countOfMatchingWinners++;
                    }
                    y++;
                }
                y = 0;
            }
            return countOfMatchingWinners;
    }
    public static int calculateScoreBasedUponWinningNumbers(int winningNumbers) {
        int score = (int) Math.pow(2, (winningNumbers-1));
            return score;
    }
    public static int calculateTotalCards(String[] cards)
    {
        int totalNumOfExtraCards = 0;
        int[] extraCardsCount = new int[cards.length];
        for (int index = 0; index < cards.length; ++index) {
            int matchesForCurrentCard = calculateWinningNumbersForCard(cards[index]);
        }
        return cards.length + totalNumOfExtraCards;
    }
    public static void runOverDataFile() throws IOException
    {
        Path dataPath = Paths.get("Data.txt");
        List<String> lines = Files.readAllLines(dataPath, StandardCharsets.UTF_8);
        int totalScore = 0;
        for (String line: lines) {
            int countOfWinningNumbersForLine = calculateWinningNumbersForCard(line);
            int scoreForLine = calculateScoreBasedUponWinningNumbers(countOfWinningNumbersForLine);
            totalScore += scoreForLine;
        }
        System.out.println("Total Score is " + totalScore);
    }
    public static void quickTest() {
        String card = "Card 3:  1 21 53 59 44 | 69 82 63 72 16 21 14  1";
        int countOfMatchedWinners = calculateWinningNumbersForCard(card);
        System.out.println("Count of watched winners " + countOfMatchedWinners + " for card " + card);
        int score = calculateScoreBasedUponWinningNumbers(countOfMatchedWinners);
        System.out.println("Score for above card is " + score);
    }
    public static void main(String[] args) throws Exception {
        //quickTest();
        runOverDataFile();
    }
}

