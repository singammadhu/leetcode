class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];

        // Even numbers should go to even indices: 0, 2, 4...
        int e = 0;

        // Odd numbers should go to odd indices: 1, 3, 5...
        int o = 1;

        for (int i = 0; i < nums.length; i++) {

            // Place even number at the next available even index
            if (nums[i] % 2 == 0) {
                ans[e] = nums[i];
                e += 2;
            }

            // Place odd number at the next available odd index
            else {
                ans[o] = nums[i];
                o += 2;
            }
        }

        return ans;
    }
}