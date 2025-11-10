import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_IsDuplicateExist {
    public static void main(String[] args) {
        int arr[]={4,2,3,7,8,2,1,3};
        List<Integer>answer=new ArrayList<>();
        answer=findDuplicates(arr);

        for(int num:answer){
            System.out.println(num);
        }
    }

    private static List<Integer> findDuplicates(int[] arr) {
        List<Integer> answer=new ArrayList<>();

        Arrays.sort(arr);

        for(int i=1;i<arr.length;i++){

            if(arr[i]==arr[i-1]){
                answer.add(arr[i]);
            }
        }

        return answer;
    }
}
