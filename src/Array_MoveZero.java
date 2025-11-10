public class Array_MoveZero {
    public static void main(String[] args) {
        int arr[]={1,2,0,3,0,4,0,5,6};
        moveZeros(arr);

    }

    private static void moveZeros(int[] arr) {
        int j=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0) {j=i;break;}

        }
        if(j!=-1){
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]!=0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }


}
