import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size=sc.nextInt();
        System.out.println("Enter the value of Array");
        int arr[]=new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         size= removeDuplicate(arr);
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

}
public static int removeDuplicate(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }

        }
        return i+1;


}

}

