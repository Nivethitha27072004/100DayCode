public class SingleNumber {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,5,6,6};
        int result=singleNumber(arr);
        System.out.println(result);


}

    private static int singleNumber(int[] arr) {

        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }}
