public class RotateDElement {
    public static void main(String[] args) {
            int arr[]={1,2,3,4,5};
            int d=2;
            rotate(arr,d);

    }
            public static int[] rotate(int[] arr, int d) {
                int n = arr.length;
                if (n == 0) return arr;
                d %= n;
                if (d == 0) return arr;
                reverse(arr, 0, n - 1);
                reverse(arr, 0, d - 1);
                reverse(arr, d, n - 1);
                return arr;
            }
            private static void reverse(int[] arr, int l, int r) {
                while (l < r) {
                    int tmp  = arr[l];
                    arr[l++] = arr[r];
                    arr[r--] = tmp;
                }
            }

    }

