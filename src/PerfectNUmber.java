public class PerfectNUmber {
    public static void main(String[] args) {
        int number=6;
        System.out.println(isPerfectNumber(number));
    }

    private static boolean isPerfectNumber(int number) {
        int sum=0,og_number=number;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        return sum==og_number;


    }
}
