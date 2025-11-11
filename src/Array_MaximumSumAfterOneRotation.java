public class Array_MaximumSumAfterOneRotation {
    public static void main(String [] args){
        int arr[]={1,2,3,4,5};
        int d=1;
        System.out.println(findsum(arr,d));
    }

    private static int findsum(int[] arr,int d) {
        int sum=0;

        reverse(arr,0,arr.length-1);
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);


        for(int i =0;i<arr.length;i++){
            sum=sum+(arr[i]*i);
        }

        return sum;
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
