class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        // Answer array to store squares in sorted order
        int[] ans = new int[n];

        // Left pointer -> leftmost candidate
        int l = 0;

        // Right pointer -> rightmost candidate
        int r = n - 1;

        // Next position to fill in the answer array
        // We fill from the back because the largest square comes first.
        int idx = n - 1;

        // Process until all elements are used
        while (l <= r) {

            // Square of left and right elements
            int leftSquare = nums[l] * nums[l];
            int rightSquare = nums[r] * nums[r];

            // The largest remaining square is always at one of the two ends.
            if (leftSquare > rightSquare) {

                // Place larger square at current answer position
                ans[idx] = leftSquare;

                // Left element has been used
                l++;

            } else {

                // Place larger (or equal) square at current answer position
                ans[idx] = rightSquare;

                // Right element has been used
                r--;
            }

            // Move to the next position in the answer array
            idx--;
        }

        return ans;
    }
}