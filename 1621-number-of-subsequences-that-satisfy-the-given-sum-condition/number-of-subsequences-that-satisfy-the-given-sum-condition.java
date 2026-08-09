class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
      int n= nums.length;
      int l = 0;
      int r = n-1;
      int c=0;
      int MOD = 1_000_000_007;
      int[] pow = new int[n];
      pow[0]=1;
      for(int i=1;i<n;i++){
        pow[i]=(pow[i-1]*2)%MOD;
      }
      while(l<=r){
        int sum = nums[l]+nums[r];
        if(sum<=target){
         c = (c + pow[r - l]) % MOD;
         l++;
        }else{
            r--;
        }
      }
      return c;  
    }
}