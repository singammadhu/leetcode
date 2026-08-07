class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int n= nums.length;
        for(int i=n-1;i>1;i--){
            int l =0;
            int r=i-1;
            while(l<r){
                int sum =nums[l]+nums[r];
                if(sum>nums[i]){
                  count+=r-l;
                  r--;
                }else{
                   l++; 
                }
            }
        }
        return count;
    }
}