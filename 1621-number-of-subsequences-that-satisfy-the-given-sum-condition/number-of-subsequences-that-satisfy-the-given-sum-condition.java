class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int MOD = 1_000_000_007;
        
        // Sort the array
        Arrays.sort(nums);
        
        // Precompute powers of 2: pow[i] = 2^i % MOD
        int[] pow = new int[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % MOD;
        }
        
        int left = 0, right = n - 1;
        int count = 0;
        
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                // All subsequences from left to right are valid
                count = (count + pow[right - left]) % MOD;
                left++;
            } else {
                right--;
            }
        }
        
        return count;
    }
}