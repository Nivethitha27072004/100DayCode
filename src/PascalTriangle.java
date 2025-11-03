import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        int numberOfRows = 5;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // Generate each row
        for (int i = 1; i <= numberOfRows; i++) {
            arr.add(generateRowValues(i));
        }

        // Print the triangle
        for (ArrayList<Integer> row : arr) {
            System.out.println(row);
        }
    }

    // Function to generate values for a given row number
    private static ArrayList<Integer> generateRowValues(int row) {
        ArrayList<Integer> ansRow = new ArrayList<>();
        int ans = 1;

        // Always start with 1
        ansRow.add(1);

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col) / col;
            ansRow.add(ans);
        }

        return ansRow;
    }
}
