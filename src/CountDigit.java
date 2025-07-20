import java.util.Scanner;

public class CountDigit {
    public static void main(String[]args){
        System.out.println("Enter the digit:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("number of digits are:"+countDigit(number));

    }
    public static int countDigit(int number){
        int count=0;
        while(number!=0) {
            int unit_digit = number % 10;
            count++;
            number/=10;
        }
        return count;

    }
}
