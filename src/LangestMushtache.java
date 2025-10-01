import java.util.*;
public class LangestMushtache {
        public List<Integer> twoLongest(int[] lengths) {
            //  ArrayList al<Integer> = new ArrayList<Integer>();

            int max=Integer.MIN_VALUE;
            int secMax=Integer.MIN_VALUE;

            for(int i=0;i<lengths.length;i++){

                if(lengths[i]>max){
                    secMax=max;
                    max=lengths[i];
                }
                else if(lengths[i]>secMax){
                    secMax=lengths[i];
                }
            }


            return new ArrayList<>(Arrays.asList(max,secMax));
        }

        public static void main(String[] args) {
            LangestMushtache solution = new LangestMushtache();
            System.out.println(solution.twoLongest(new int[]{4, 1, 7, 3, 9})); // Expected: [9, 7]
            System.out.println(solution.twoLongest(new int[]{2, 2, 2}));       // Expected: [2, 2]
        }
    }



}