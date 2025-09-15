public class Factorial {
    public static void main(String[] args) {
        int number=5;
        System.out.println(findFactorial(number));
    }

    private static int findFactorial(int number) {
        int fact=1;
        if(number==0){
             return 1;
        }
        return number*findFactorial(number-1);
    }
}
