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
                     /*
             Fix:
             - Largest side (fixed)
             - Right side

             If current left is valid, (ie left + right > fixed)
             then
             every left till right-1
             also works.
            */
                  count+=r-l;
                  r--;// Done with this right.
                }else{
                   l++;// Need a larger sum.
                }
            }
        }
        return count;
    }
}