class Solution {
    public int threeSumClosest(int[] nums, int target) {

        // Sort the array so we can apply Opposite Ends (Two Pointers).
        Arrays.sort(nums);

        int n = nums.length;

        // Stores the best (closest) sum found so far.
        //int closest = Integer.MAX_VALUE;
        int closest = nums[0] + nums[1] + nums[2];
        /*
        Observation #5
        For "Closest" problems,

        Don't initialize with Integer.MAX_VALUE when using Math.abs(target - answer).

        Reason: Integer overflow.

        Initialize with the first valid answer instead.
        */

        // Fix one element and solve the remaining part using Two Pointers.
        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // If current sum is closer to target,
                // update the best answer.

                // We calculate:
                // 1. Difference  -> target - sum
                // 2. Convert it into distance using Math.abs()
//
                 // Example:
                 // target = -1, sum = 2
                 // Difference = -3
                 // Distance   = Math.abs(-3) = 3
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                // Prepare the next pair.
                // Need a larger sum -> move left.
                if (sum < target) {

                    left++;

                }
                // Need a smaller sum -> move right.
                else if (sum > target) {

                    right--;

                }
                // Exact target found.
                //sum==target=>closest=0
                else {

                    return sum;
                }
            }
        }

        return closest;
    }
}

/*
Whenever you hear:

• Closest
• Nearest
• Minimum Difference
• Shortest Distance

Immediately think:

Math.abs(a - b)

because

Absolute Difference

=

Distance
*/
                    