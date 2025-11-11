import java.util.Arrays;

public class Array_FirstPositiveElement {
    public static void main(String[] args){
        int arr[]={3,4,-1,1};
        findMissingNumber(arr);
    }

    private static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        int start=arr[0];
        for(int i=start;i<arr.length;i++){
          if(arr[i]>0 && arr[i]!=i){
              return i;
          }
        }
       return 9;
    }
}
