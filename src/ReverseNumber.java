import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ReverseNumber rn=new ReverseNumber();
        System.out.println("enter the number:");
        int number =sc.nextInt();
        System.out.println("the revesrsed digit:"+ rn.reveseNumber(number));


    }
       int reveseNumber(int number){
        int revNum=0;
        while(number!=0){
            int unitDigit=number%10;
            revNum=(revNum*10)+(unitDigit);
            number/=10;

        }
        return revNum;

     }

}
