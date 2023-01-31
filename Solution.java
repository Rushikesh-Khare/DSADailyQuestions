//package 31-01-2023;

public class Solution {
    public int majorityElement(int[] nums) {
       
        // space compexity o(1);
        int me = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(me == nums[i]){
                count++;
            }else if(count > 0){
                count--;
            }else{

            }
            if(count == 0){
                me = nums[i];
                count = 1;
            }
        }
        return me;
    }
}
