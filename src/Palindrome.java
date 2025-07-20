import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int number=sc.nextInt();
        isPalindromeNumber(number);

    }
    public static void isPalindromeNumber(int number){
        int temp=number;
        int rev=0;
        while (number != 0) {
            int unit_digit=number%10;
            rev=(rev*10)+(unit_digit);
            number=number/10;
        }
        if(temp==rev){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not a palindrome");
        }
    }
}
