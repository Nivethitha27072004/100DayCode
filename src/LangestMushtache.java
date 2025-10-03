/*In a lively town, a famous barber shop was known for its customers' grand moustaches. The barber's task today was simple: find the two longest moustaches among them.
Task
Write a program that finds and returns the lengths of the two largest moustaches.

Input
An integer array moustaches of length n where:

2 ≤ n ≤ 10^5

1 ≤ moustaches[i] ≤ 10^9
Output
An array containing the two largest values from moustaches. The larger value should appear first.

Examples
Example 1

Input: moustaches = [4, 1, 7, 3, 9]

Output: [9, 7]

Example 2

Input: moustaches = [2, 2, 2]

Output: [2, 2]*/



import java.util.*;
public class LangestMushtache {
        public List<Integer> twoLongest(int[] lengths) {
            //  ArrayList al<Integer> = new ArrayList<Integer>();

            int max=Integer.MIN_VALUE;
            int secMax=Integer.MIN_VALUE;

            for(int i=0;i<lengths.length;i++){

                if(lengths[i]>max){
                    secMax=max;
                    max=lengths[i];
                }
                else if(lengths[i]>secMax){
                    secMax=lengths[i];
                }
            }


            return new ArrayList<>(Arrays.asList(max,secMax));
        }

        public static void main(String[] args) {
            LangestMushtache solution = new LangestMushtache();
            System.out.println(solution.twoLongest(new int[]{4, 1, 7, 3, 9})); // Expected: [9, 7]
            System.out.println(solution.twoLongest(new int[]{2, 2, 2}));       // Expected: [2, 2]
        }
    }

