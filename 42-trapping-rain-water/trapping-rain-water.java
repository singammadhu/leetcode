class Solution {

    public int trap(int[] height) {

        int l = 0;
        int r = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int water = 0;

        while (l < r) {

            // Highest wall seen so far from the left
            leftMax = Math.max(leftMax, height[l]);

            // Highest wall seen so far from the right
            rightMax = Math.max(rightMax, height[r]);

            // The smaller maximum determines the water level
            if (leftMax < rightMax) {

                // Water trapped at the left index
                // = leftMax - current height
                water += leftMax - height[l];

                // Left side is fully determined, so move left pointer
                l++;

            } else {

                // Water trapped at the right index
                // = rightMax - current height
                water += rightMax - height[r];

                // Right side is fully determined, so move right pointer
                r--;
            }
        }

        return water;
    }
}