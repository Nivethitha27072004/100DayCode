/*In a magical land where words carried mystical power, the prestigious Crown Words were honored with a regal sequence of letters. According to legend, only words that start and end with the same letter could earn the title of Crown Word.
        Task
        Given an array of strings, count how many words qualify as Crown Words.

        Input
        An array of strings words where:

        1 ≤ len(words) ≤ 104
        Each word consists only of lowercase English letters.
        Output
        An integer representing the number of Crown Words.

        Example
        Example 1

        Input: words = ["apple", "civic", "crown", "aba"]

        Output: 2

        Explanation: "civic" and "aba" are Crown Words.

        Example 2

        Input: words = ["noon", "level", "moon", "night", "racecar"]

        Output: 3

        Explanation: "noon", "level", and "racecar" are Crown Words.

        Example 3

        Input: words = ["a", "b", "c", "aa", "bb", "ab"]

        Output:5

        Explanation: "a", "b", "c", "aa", and "bb" are Crown Words. Only "ab" is not.
*/
    import java.util.*;

    class Solution {
        public int countCrownWords(String[] words) {
            // TODO: implement the logic to count Crown Words
            int count =0;

            for(int i=0;i<words.length;i++){
                if(words[i].charAt(0)==words[i].charAt(words[i].length()-1)){
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();

            System.out.println(solution.countCrownWords(new String[]{"apple", "civic", "crown", "aba"}));
            // Expected: 2

            System.out.println(solution.countCrownWords(new String[]{"noon", "level", "moon", "night", "racecar"}));
            // Expected: 3

            System.out.println(solution.countCrownWords(new String[]{"a", "b", "c", "aa", "bb", "ab"}));
            // Expected: 5
        }
    }


