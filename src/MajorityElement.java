public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            int size=nums.length;
            int element=0;
            int count=0;


            for(int i=0;i<nums.length;i++){
                if(count==0){
                    count=1;
                    element=nums[i];
                }
                else if(element==nums[i]) count++;
                else count--;
            }
            System.out.println(element );
            System.out.println(count );
            int count1=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==element) count1++;
            }



            if(count1>(size/2))return element;
            else return-1;


        }
    }
}
