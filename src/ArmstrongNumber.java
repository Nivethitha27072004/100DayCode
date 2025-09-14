public class ArmstrongNumber {
    public static void main(String[] args) {
        int number=371;
        System.out.println(isArmstrong(number));
    }

    private static boolean isArmstrong(int number) {
        int order=findOrder(number);
        int og_number=number;

        int powered=0;
        while(number!=0){
            int digit=number%10;
            powered+=(int)Math.pow(digit,order);
            number=number/10;

        }
        return powered==og_number;

    }

    private static int findOrder(int num) {
        int len = 0;
        while (num!=0)
        {
            len++;
            num = num/10;
        }
        return len;
    }

}
