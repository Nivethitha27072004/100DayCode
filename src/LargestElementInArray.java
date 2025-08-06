import java.util.Scanner;

public class LargestElementInArray {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the size of Array:");
        int size=sc.nextInt();
        System.out.println("Enter the value of Array");
        int arr[]=new int[size];
        for(int i =0;i<size;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println(findLargest(arr));
    }
     static int findLargest(int arr[]){
      int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;

    }



}
