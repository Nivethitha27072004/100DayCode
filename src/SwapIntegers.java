import java.util.Scanner;

//swap without third integer;
public class SwapIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //logic:
        System.out.println("before A= "+a );
        System.out.println("before B="+b );

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After A= "+a);
        System.out.println("After B="+b);
    }
}
