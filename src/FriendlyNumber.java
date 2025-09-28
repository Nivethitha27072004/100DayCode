public class FriendlyNumber {
    public static void main(String[] args) {
        int number1=6;
        int number2=28;

        int sum1=findDivisor(number1);
        int sum2=findDivisor(number2);

        if(sum1/number1==sum2/number2){
            System.out.println("frienly");
        }
        else {
            System.out.println("not");
        }


    }

    private static int findDivisor(int number) {
        int sum=0;
        for(int i=1;i<=number;i++){
            if(number%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}
