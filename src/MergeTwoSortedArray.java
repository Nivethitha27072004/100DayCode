import java.util.Arrays;

class MergeTwoSortedArray {
    public void merge(int[] arr1, int m, int[] arr2, int n) {

        int left = m - 1;  // last index of arr1
        int right = 0;     // first index of arr2

        // Step 1: Compare and swap
        while (left >= 0 && right < n) {
            if (arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
            } else {
                break;
            }
            left--;
            right++;
        }

        // Step 2: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
