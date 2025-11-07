import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedOverlapSubArray {

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };

        MergedOverlapSubArray obj = new MergedOverlapSubArray();
        int[][] result = obj.merge(intervals);

        // Print the merged result
        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public int[][] merge(int[][] intervals) {
        List<List<Integer>> merged = getOverLapped(intervals);

        // Convert List<List<Integer>> → int[][]
        int[][] arr = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            arr[i][0] = merged.get(i).get(0);
            arr[i][1] = merged.get(i).get(1);
        }
        return arr;
    }

    private static List<List<Integer>> getOverLapped(int[][] intervals) {

        // Step 1: Sort based on start value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < interval[0]) {
                merged.add(Arrays.asList(interval[0], interval[1]));
            } else {
                int last = merged.size() - 1;
                int maxEnd = Math.max(merged.get(last).get(1), interval[1]);
                merged.get(last).set(1, maxEnd);
            }
        }
        return merged;
    }
}
