import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size=sc.nextInt();
        System.out.println("Enter the value of Array");
        int arr[]=new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findSecLargest(arr));
    }

    private static int findSecLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            else if(arr[i]>secMax&&arr[i]!=max){
                secMax=arr[i];
            }
        }
return secMax;
    }
}
