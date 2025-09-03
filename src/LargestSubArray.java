public class LargestSubArray{
    public static void main(String[] args) {
    int array[]={1,1,1,2,3,1,1,1,1,2,2};
    int k=2;
    int i=0,sum=0,maxLength=0;
    for(int j=0;j<array.length;j++){
    sum=sum+array[j];

    while(sum >k && i<=j){
        sum=sum-array[i];
        i++;

    }
    if(sum==k){
        maxLength=Math.max(maxLength,j-i+1);
    }
    
    }
System.out.println("Largest="+maxLength);
        
}
}