class Solution {
   public int removeDuplicates(int[] nums) {
        int w=0,r=1;
        while(r<nums.length){
            if(nums[w]==nums[r]){
                r++;
            }else {
                w++;
                nums[w]=nums[r];
                r++;
            }
        }
        return w+1;
    }
}