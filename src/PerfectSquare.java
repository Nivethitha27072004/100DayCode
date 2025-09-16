public class PerfectSquare {
    public static void main(String[] args) {
        int number=49;
        System.out.println(isPerfectSquare(number));
    }

    private static boolean isPerfectSquare(int number) {
        if(number>=0){
            int sc=(int)Math.sqrt(number);
            return ((sc*sc)==number);
        }
        return false;

    }
}
