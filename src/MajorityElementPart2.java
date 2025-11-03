import java.util.ArrayList;
import java.util.List;

public class MajorityElementPart2 {
    public static void main(String[] args) {
        int numbers[] = {3, 2, 3};
        System.out.println(findMajority(numbers));
    }

    private static List<Integer> findMajority(int[] numbers) {
        List<Integer> arr = new ArrayList<>();
        int count1 = 0, count2 = 0;
        Integer element1 = null, element2 = null;

        // Step 1: Find possible candidates
        for (int num : numbers) {
            if (element1 != null && num == element1) {
                count1++;
            } else if (element2 != null && num == element2) {
                count2++;
            } else if (count1 == 0) {
                element1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                element2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify counts
        count1 = 0;
        count2 = 0;
        for (int num : numbers) {
            if (element1 != null && num == element1) count1++;
            if (element2 != null && num == element2) count2++;
        }

        int n = numbers.length;
        if (count1 > n / 3) arr.add(element1);
        if (count2 > n / 3) arr.add(element2);

        return arr;
    }
}
