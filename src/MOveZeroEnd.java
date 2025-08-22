public class MOveZeroEnd {
    public static void main(String[] args) {
        int arr[]={2,0,3,0,4,0,0,5,6};
        moveZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
    public static void moveZero(int arr[]){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){j=i;
                break;
        }}
        if(j!=0){
                for(int i=j+1;i<arr.length;i++){
                    if(arr[i]!=0){
                       arr[i]=arr[i]^arr[j];
                       arr[j]=arr[i]^arr[j];
                       arr[i]=arr[i]^arr[j];
                        j++;
                    }
                }

        }
    }
}
