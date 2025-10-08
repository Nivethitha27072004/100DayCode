/*
In a vast forest, wildlife researchers studied deer by tracking their unique tag numbers. Each day, rangers recorded sightings, creating a record of how often each deer appeared.
Task
Given a list of integers representing deer tag numbers, return the tag number of the deer with the most sightings. If multiple deer have the same maximum sightings, choose the one with the smallest tag number.

Input
An integer array sightings of length n where:

1 ≤ n ≤ 104
Each value in sightings is a positive integer (tag number).
Output
An integer representing the tag number of the deer with the most sightings.

Example
Example 1

Input: sightings = [101, 102, 101, 103, 102, 101, 104, 103]

Output: 101

Explanation: Deer 101 → 3 sightings, Deer 102 → 2 sightings, Deer 103 → 2 sightings, Deer 104 → 1 sighting. Deer 101 has the most sightings.

Example 2

Input: sightings = [201, 202, 201, 202, 203]

Output: 201

Explanation: Deer 201 and Deer 202 both have 2 sightings, but Deer 201 has the smaller tag number.
*/
import java.util.*;
public class Deer {

    public int mostSightedDeer(int[] sightings) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count sightings
        for (int id : sightings) {
            map.put(id, map.getOrDefault(id, 0) + 1);
        }

        // Step 2: Find deer with most sightings (smallest tag if tie)
        int maxCount = 0;
        int deerId = Integer.MAX_VALUE;

        for (int key : map.keySet()) {
            int count = map.get(key);

            if (count > maxCount || (count == maxCount && key < deerId)) {
                maxCount = count;
                deerId = key;
            }
        }

        return deerId;


    }

    public static void main(String[] args) {
       Deer solution = new Deer();
        System.out.println(solution.mostSightedDeer(new int[]{101, 102, 101, 103, 102, 101, 104, 103}));  // Expected: 101
        System.out.println(solution.mostSightedDeer(new int[]{201, 202, 201, 202, 203}));                  // Expected: 201
    }
}
