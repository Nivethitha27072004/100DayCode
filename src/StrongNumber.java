public class StrongNumber {
    public static void main(String[] args) {
        int number=145;
        System.out.println(isStrongNumber(number));
    }

    private static boolean isStrongNumber(int number) {
        int newNumber=0;
        int og_number=number;
        while(number!=0) {
            int digit = number % 10;
            newNumber += factNumber(digit);
            number=number/10;
        }
        return og_number==newNumber;

    }

    private static int factNumber(int digit) {

        if(digit==0){
            return 1;
        }
        return digit*factNumber(digit-1);
    }

}
