/*
n a busy warehouse, the manager keeps track of crates arranged in a single line. Each crate has a specific weight, represented by numbers in an array. To make loading and unloading easier, the manager wants to quickly identify the heaviest crate. If there are multiple crates tied for the heaviest weight, the manager will always choose the first one in line.
Task
Write a program that finds the index of the heaviest crate in the array.

Input
An integer array crates of length n where:

1 ≤ n ≤ 105
Each value represents the weight of a crate.
Output
An integer representing the index of the heaviest crate (0-based indexing).

Examples
Example 1

Input: crates = [50, 75, 20, 75, 60]

Output: 1

Explanation: The heaviest weight is 75. It appears at indices 1 and 3, but the first occurrence is at index 1.

Example 2

Input: crates = [10, 20, 30, 40, 50]

Output: 4

Explanation: The heaviest weight is 50, at index 4.
 */


public class Heaviest {
    public static void main(String[] args) {
        int arr[]={10,20,60,30,60,40,50,60};
        int max=arr[0];
        int ind=0;
        for(int i=1;i< arr.length;i++){

            if(max<arr[i]){
                max=arr[i];
                ind=i;
            }


        }
        System.out.println(max);
        System.out.println(ind);
    }
}
