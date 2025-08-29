
import java.util.Arrays;



public class TwoSum{
    public static void main(String[] args) {
        TwoSum ts=new TwoSum();
        int nums[]={3,1,5,4,7,8};
        int target=5;
        System.out.println(Arrays.toString(ts.twoSum(nums, target)));
        System.out.println("hello");;
        
    }
    public  int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // return empty if not found
    }

}




