public class ConvertDecimal2Binary {
    public static void main(String[] args) {
        int decimal = 5;
        System.out.println(convertBinary(decimal));
    }

    private static String convertBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal = decimal / 2;
        }

        return binary.reverse().toString(); // reverse to get correct order
    }
}
