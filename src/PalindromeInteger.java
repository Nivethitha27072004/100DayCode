public class PalindromeInteger {
    public static void main(String[] args) {
        int number =121;
        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {
        int og_number=number;
        int reversed=0;
        while(number!=0) {
            int digit = number % 10;
            reversed = digit + reversed * 10;
            number = number / 10;
        }


        return og_number-number==reversed;
    }
}
