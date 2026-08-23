class Solution {
    public int removeDuplicates(int[] nums) {

        int w = 0;  // WRITE pointer
        int r = 0;  // READ pointer

        while (r < nums.length) {

            int count = 1;

            // r reads the current group and counts duplicates.
            while (r + 1 < nums.length &&
                   nums[r] == nums[r + 1]) {
                r++;
                count++;
            }

            // Write at most 2 copies of the current value.
            for (int i = 0; i < Math.min(2, count); i++) {
                nums[w] = nums[r];
                w++;
            }

            // Move r to the next group.
            r++;
        }

        return w;
    }
}