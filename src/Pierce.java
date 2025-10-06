/*
A skilled blacksmith is crafting a circular blade. Around the edge of the blade, he carefully marks n notches, each at equal distance. These notches are represented as numbers arranged in a circular sequence. To test the durability and symmetry of his blade, he wants to rotate the notches clockwise by k positions. Since the blade is circular, if the rotation count k is greater than n, the notches will simply wrap around.
Task
Given an array arr of length n and an integer k, rotate the array clockwise by k positions and return the result.

Input
An integer array arr of length n where:

1 ≤ n ≤ 105
An integer k where:

0 ≤ k ≤ 109
Output
An array representing the rotated sequence.

Example
Example 1

Input: arr =  [1, 2, 3, 4, 5]
k = 2

Output:[4, 5, 1, 2, 3]

Example 2

Input: arr = [10, 20, 30, 40]
k = 6

Output:[30, 40, 10, 20]
*/
{
import java.util.*;

public class Pierce  {


        }
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(Arrays.toString(solution.rotateClockwise(new int[]{1, 2, 3, 4, 5}, 2)));   // Expected: [4, 5, 1, 2, 3]
            System.out.println(Arrays.toString(solution.rotateClockwise(new int[]{10, 20, 30, 40}, 6)));  // Expected: [30, 40, 10, 20]
        }
    public int[] rotateClockwise(int[] arr, int d) {
        int n=arr.length;
        if(n==0)return arr;
        d=d%n;
        if(d==0)return arr;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);

        return arr;
    }
    private static void reverse(int [] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr [l++]=arr[r];
            arr[r--]=temp;
        }
    }



}
