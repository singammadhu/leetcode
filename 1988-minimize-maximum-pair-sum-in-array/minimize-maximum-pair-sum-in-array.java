class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums); 
        int l=0,r=nums.length-1;
        int mineMax=0;
        while(l<r){
         int sum=nums[l]+nums[r];
         mineMax=Math.max(mineMax,sum);
         l++;
         r--;
        }
        return mineMax;
    }
}