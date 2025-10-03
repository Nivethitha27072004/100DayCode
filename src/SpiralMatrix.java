import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(sprialMatrix(arr));
    }

    private static ArrayList<Integer> sprialMatrix(int[][] arr) {
        ArrayList<Integer>answer = new ArrayList<Integer>();
        int left=0,right= arr.length-1;
        int top=0,bottom= arr.length-1;

//[][]-row coloum
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                answer.add(arr[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                answer.add(arr[i][right]);

            }
            right--;
if(top<=bottom) {
    for (int i = right; i >= left; i--) {
        answer.add(arr[bottom][i]);
    }
    bottom--;
}

if(left<=right) {
    for (int i = bottom; i >= top; i--) {
        answer.add(arr[i][left]);
    }
    left++;
}
        }
        return answer;
    }

}
