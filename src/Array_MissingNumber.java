public class Array_MissingNumber {
    public static void main(String[] args) {
        int number[]={1,2,3,4,0};
        int op=findMissingNumber(number);
        System.out.println(op);
    }

    private static int findMissingNumber(int[] number) {
        int n=number.length;
        int sum=0;
        int total=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum=sum+number[i];
        }

        return total-sum;
    }
}
