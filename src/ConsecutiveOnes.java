public class ConsecutiveOnes {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,1,0,1,1,1};
        int count=consecutiveOnes(arr);
        System.out.println(count);


    }

    private static int consecutiveOnes(int[] arr) {
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            if(max<count){
                max=count;
            }
        }
return max;
    }

}
