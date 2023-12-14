import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static int calculateNumForLine(String input) {
            int first_num_index = -1;
            int last_num_index = -1;
            for (int index = 0; index < input.length(); index++) {
                String current_character = input.substring(index, index+1);
                boolean foundNum = false;
                if ("1".equals(current_character) ||
                    "2".equals(current_character) ||
                    "3".equals(current_character) ||
                    "4".equals(current_character) ||
                    "5".equals(current_character) ||
                    "6".equals(current_character) ||
                    "7".equals(current_character) ||
                    "8".equals(current_character) ||
                    "9".equals(current_character)
                    ) {
                    foundNum = true;
                }
                if (foundNum == true) {
                    last_num_index = index;
                    if (first_num_index == -1) {
                       first_num_index = index;
                    }
                }
            }
            int first_num = Integer.parseInt(input.substring(first_num_index, first_num_index+1));
            int last_num = Integer.parseInt(input.substring(last_num_index, last_num_index+1));

            int line_num = (first_num*10) + last_num;
            return line_num;
    }
    public static void main(String[] args) throws Exception {
        String input = "ab3093az";
        Path dataPath = Paths.get("Data.txt");
        List<String> lines = Files.readAllLines(dataPath, StandardCharsets.UTF_8);
        int sum = 0;
        for (String line: lines) {
            int valForLine = calculateNumForLine(line);
            sum += valForLine;
        }
        System.out.println("Sum is " + sum);
    }
}

