// 10 october 2025 //
public class Leetcode3174 {
    public static void main(String[] args) {
        int arr[]={5,2,-10,-5,1};
        int k=3;
        int max=0;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int  j=i;

            while(j<n){
                sum = arr[j] + sum;
                j=j+k;
            }
            max=Math.max(max,sum);

            sum=0;
        }
    }
    class Solution {
        public int maximumEnergy(int[] energy, int k) {
            int n = energy.length;
            int[] dp = new int[n];
            int maxEnergy = Integer.MIN_VALUE;

            for (int i = n - 1; i >= 0; i--) {
                dp[i] = energy[i];
                if (i + k < n) {
                    dp[i] += dp[i + k];
                }
                maxEnergy = Math.max(maxEnergy, dp[i]);
            }

            return maxEnergy;
        }
    }

}
