class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;

        int l = 0;
        int r = height.length - 1;

        while (l < r) {

            int area = Math.min(height[l], height[r]) * (r - l);
            maxArea=Math.max(area,maxArea);
            // Area is limited by the shorter wall
            if (height[l] < height[r]) {
                l++;    // Move the shorter wall
            } else {
                r--;    // Move the shorter wall
            }

        }

        return maxArea;
    }
}