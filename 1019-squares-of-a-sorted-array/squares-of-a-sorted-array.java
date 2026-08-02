class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l=0,r=n-1,i=n-1;
        while(l<=r){
            int ls=nums[l]*nums[l],rs=nums[r]*nums[r];
            if(ls>rs){
                ans[i]=ls;
                l++;
            }else {
                ans[i]=rs;
                r--;
            }
            i--;
        }
        return ans;
    }
}