//upstop-100code (day1)
import java.util.Scanner;

public class ChessBoard {

    public static String determineColor(String s) {
        String letterPart = s.replaceAll("[0-9]", "");
        int letter = (int) letterPart.charAt(0);

        String numberPart = s.replaceAll("[^0-9]", "");
        int number = Integer.parseInt(numberPart);

        if ((letter % 2 == 0 && number % 2 == 0) || (letter % 2 != 0 && number % 2 != 0)) {
            return "Black";
        }

        return " White";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}
