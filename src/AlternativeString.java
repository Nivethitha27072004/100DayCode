/*n a quiet town, two mystical threads, s1 and s2, awaited a weaver to combine them. The artisan’s task was simple yet elegant: weave the strings by alternating their characters. If one thread was longer, its remaining part would be added at the end.
Task
Write a program that weaves two strings together by alternating their characters.
 If one string is longer, append the extra characters to the end.

Input
Two strings s1 and s2 where:

1 ≤ len(s1), len(s2) ≤ 100
Both strings consist only of lowercase English letters.
Output
A single string formed by weaving s1 and s2.

Examples
Example 1

Input: s1 = "abc", s2 = "pqr"

Output: "apbqcr"

Example 2

Input: s1 = "ab", s2 = "pqrs"

Output: "apbqrs"*/






import java.util.*;

public class AlternativeString {
    public static void main(String[] args) {
        String s1 = "abc", s2 = "pr";
        String answer = solution(s1, s2);
    }

    private static String solution(String s1, String s2) {


        StringBuilder result = new StringBuilder();

        int s1Size = s1.length();
        int s2Size = s2.length();
        int i = 0, j = 0;

        while (i < s1Size && j < s2Size) {
            result.append(s1.charAt(i));
            result.append(s2.charAt(j));
            i++;
            j++;

        }
        //remaining
        while (i < s1Size) {
            result.append(s1.substring(i));
        }
        while (j < s2Size) {
            result.append(s2.substring(j));
        }

        return result.toString();
    }

}

