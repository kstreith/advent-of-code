import java.util.Scanner;
public class App {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
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
    
            System.out.printf("%c%c%n", input.charAt(first_num_index), input.charAt(last_num_index));
    }
    public static void main(String[] args) throws Exception {
        String lineText = "ab3093az";
        int valForLine = calculateNumForLine(lineText);
        System.out.println("Val for " + lineText + " is " + String.valueOf(valForLine));
    }
}

git config --global user.email "you"
