public class HarshadNumber {

    public static void main(String[] args) {
        int number=21;
        int og_number=number;

        int sum=0;
        while(number!=0){
            sum+=number%10;

            number=number/10;
        }
        System.out.println(sum);
        if(og_number%sum==0){
            System.out.println(true);
       }
        else System.out.println(false);
}}
