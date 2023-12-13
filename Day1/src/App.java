public class App {
    public static int calculateNumForLine(String lineText) {
        return 45;
    }
    public static void main(String[] args) throws Exception {
        String lineText = "ab3093az";
        int valForLine = calculateNumForLine(lineText);
        System.out.println("Val for " + lineText + " is " + String.valueOf(valForLine));
    }
}
