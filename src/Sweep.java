/*
In a long corridor of rooms, each room has a cleanliness score represented by numbers in an array.
A positive number means the room is clean. A negative number means the room is dirty.
A zero means the room is average. The janitor wants to impress the inspectors by choosing a stretch of consecutive rooms that looks the best.
The score of this stretch is the sum of the cleanliness scores of those rooms.
Your job is to find the highest possible total cleanliness score among all such consecutive stretches.

Task
Given an integer array rooms, find the maximum sum of cleanliness scores among all contiguous subarrays (consecutive rooms).

Input
An integer array rooms of length n where:

1 ≤ n ≤ 105
Each element may be positive, negative, or zero.
Output
An integer representing the maximum total cleanliness score of any consecutive stretch of rooms.

Examples
Example 1

Input: rooms = [3, -2, 5, -1]
Output: 6
Explanation: The janitor chooses rooms [3, -2, 5] which give the best total = 6.

Example 2

Input: rooms = [-1, -2, -3]
Output: -1
Explanation: All rooms are dirty, so the janitor picks the least bad room: [-1].

Example 3
Input: rooms = [4, -1, 2, -2, 3, -5, 4]
Output: 6

Explanation: The janitor chooses the stretch [4, -1, 2, -2, 3] which adds up to 6.
Other possible stretches (like [4, -1, 2] = 5 or [3, -5, 4] = 2) are smaller. The best total cleanliness score is 6.

 */
//kadane's algorithm
public class Sweep {

    public static void main(String[] args) {

        int arr[]={3, -2, 5, -1};
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            max=Math.max(sum,max);

            //there is no point in carring the negative values
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
