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

