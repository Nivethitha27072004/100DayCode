import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 8, 6, 0, 0, 0, 0};
        int target = 5;

        List<List<Integer>> answer = findFourSum(arr, target);

        for (List<Integer> list : answer) {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> findFourSum(int[] arr, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // skip duplicates for i

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue; // skip duplicates for j

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum == target) {
                        answer.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) k++; // skip duplicate k
                        while (k < l && arr[l] == arr[l + 1]) l--; // skip duplicate l

                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return answer;
    }
}
