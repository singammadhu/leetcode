class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        // Start from the first odd index
        int odd = 1;

        // Check every even index
        for (int even = 0; even < nums.length; even += 2) {

            // If an even index contains an odd number,
            // find an even number at an odd index
            if (nums[even] % 2 != 0) {

                while (nums[odd] % 2 != 0) {
                    odd += 2;
                }

                // Swap the misplaced odd number
                // with the misplaced even number
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }

        return nums;
    }
}