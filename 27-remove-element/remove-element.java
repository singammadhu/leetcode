class Solution {
    public int removeElement(int[] nums, int val) {

        int write = 0;

        for (int read = 0; read < nums.length; read++) {

            if (nums[read] != val) {

                // Keep this element by writing it
                // at the next available position.
                nums[write] = nums[read];

                write++;
            }
        }

        // write = number of elements remaining.
        return write;
    }
}