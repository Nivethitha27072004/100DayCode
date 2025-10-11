public class BeePatternCount {
    public static void main(String[] args) {
        String paths = "ABACABA";
        String pattern = "ABA";
        
        int count = countOccurrences(paths, pattern);
        System.out.println(count);
    }

    public static int countOccurrences(String paths, String pattern) {
        int count = 0;
        int n = paths.length();
        int m = pattern.length();

        // Loop through every possible starting point
        for (int i = 0; i <= n - m; i++) {
            // Extract substring of length m from i
            String sub = paths.substring(i, i + m);
            
            // Compare with pattern
            if (sub.equals(pattern)) {
                count++;
            }
        }

        return count;
    }
}