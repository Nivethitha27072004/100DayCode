import java.util.ArrayList;
public class UnionOfSortedArray {
    public static void main(String[] args) {
        int array1[]={1,1,2,2,3,4,5};
        int array2[]={2,3,3,6,7,8,9,12,13};

        ArrayList<Integer> Union = unionArray(array1,array2);

        for(int val:Union){
            System.out.print(val+" ");
        }
    }

    private static ArrayList<Integer> unionArray(int[] array1, int[] array2) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int n = array1.length;
        int m = array2.length;

        while (i < n && j < m) {
            if (array1[i] <= array2[j]) {
                if (union.size() == 0 || union.get(union.size()-1) != array1[i]) {
                    union.add(array1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size()-1) != array2[j]) {
                    union.add(array2[j]);
                }
                j++;
            }
        }

        // Handle remaining elements of array1
        while (i < n) {
            if (union.get(union.size()-1) != array1[i]) {
                union.add(array1[i]);
            }
            i++;
        }

        // Handle remaining elements of array2
        while (j < m) {
            if (union.get(union.size()-1) != array2[j]) {
                union.add(array2[j]);
            }
            j++;
        }

        return union;
    }
}
