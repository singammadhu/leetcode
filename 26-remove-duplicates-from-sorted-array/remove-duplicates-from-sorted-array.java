class Solution {
    public int removeDuplicates(int[] nums) {

        int w = 0;  // write pointer: last unique element
        int r = 1;  // read pointer: scans for next unique element

        while (r < nums.length) {

            if (nums[w] == nums[r]) {

                // Next element is the same,
                // so it is a duplicate. Nothing to write.
                // Move read pointer forward.
                r++;

            } else {

                // Read found a new unique element.
                // Move write pointer to the next position.
                w++;

                // Update the write position with the new element.
                nums[w] = nums[r];

                // Continue reading.
                // r++; is also ok
            }
        }

        // w is an index, so number of unique elements = w + 1.
        return w + 1;
    }
}