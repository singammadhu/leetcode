class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;

        int l = 0;
        int r = height.length - 1;

        while (l < r) {

            int currentArea;

            // Area is limited by the shorter wall
            if (height[l] < height[r]) {
                currentArea = height[l] * (r - l);
                l++;    // Move the shorter wall
            } else {
                currentArea = height[r] * (r - l);
                r--;    // Move the shorter wall
            }

            maxArea = Math.max(maxArea, currentArea);
        }

        return maxArea;
    }
}