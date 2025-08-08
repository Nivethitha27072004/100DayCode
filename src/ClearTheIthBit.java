import java.util.Scanner;

public class ClearTheIthBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(Num&(~(i<<i)));
    }
}
