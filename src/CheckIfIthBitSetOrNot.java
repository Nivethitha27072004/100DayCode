import java.util.Scanner;

public class CheckIfIthBitSetOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the digit:");
        int N=sc.nextInt();
        System.out.println("enter the position to move:");
        int i=sc.nextInt();

        if(((N>>i)&1)==1){
            System.out.println("set");

        }
        else{
            System.out.println("not");
        }
    }
}
