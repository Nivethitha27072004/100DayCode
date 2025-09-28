public class LeaderInTheArray {
    public static void main(String[] args) {
        int arr[]={3,2,22,12,0,6,4};
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>0;i--){
            if(max<arr[i]){
                max=arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
