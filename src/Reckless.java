import java.util.Arrays;

import static java.util.Collections.swap;

public class Reckless {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};

        /*to revese the array-----method 01;
       int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
      */
        int n=arr.length;
        int left=0,right=n-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }


            System.out.println(Arrays.toString(arr));


    }


}
