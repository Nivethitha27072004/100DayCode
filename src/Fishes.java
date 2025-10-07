
/*
In the deep ocean, where corals gleam and pearls whisper ancient secrets, a wise starfish guarded the sea’s magical treasures. One day, the Ocean King challenged the starfish:

“Can you discover whether some of these treasures together weigh exactly the sacred target weight?”
Task
Given a list of positive integers representing treasures and an integer target, determine whether it is possible to select some treasures (each treasure at most once) such that their total weight equals the target.

Input
An integer array treasures of length n and an integer target where:

1 ≤ n ≤ 30
1 ≤ target ≤ 500
Output
Return "Yes" if there exists a subset of treasures whose sum equals the target. Otherwise, return "No".

Examples
Example 1

Input: treasures = [2, 3, 5], target = 8

Output: Yes

Explanation: 3 + 5 = 8.

Example 2

Input: treasures = [1, 4, 6], target = 8

Output: No

Explanation: No subset sums to 8.

Example 3

Input: treasures = [2, 3, 7, 8], target = 12

Output: Yes

Explanation: 2 + 3 + 7 = 12 (requires more than two treasures).
 */
    import java.util.*;

    public class Fishes {
        public String canReachTarget(int[] treasures, int target) {
            int sum=treasures[0];
            int left=0;int right=0;
            while(right<treasures.length){
                while(left<=right&& sum>target){
                    sum=sum-treasures[left];
                    left++;

                }
                right++;
                if(right<treasures.length){
                    sum=sum+treasures[right];
                }
                if(sum==target){
                    return "yes";

                }
            }
            return "No";
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.canReachTarget(new int[]{2, 3, 5}, 8)); // Expected: Yes
            System.out.println(solution.canReachTarget(new int[]{1, 4, 6}, 8)); // Expected: No
            System.out.println(solution.canReachTarget(new int[]{2, 3, 7, 8}, 12)); // Expected: Yes
        }
    }

