class Solution {
    public int maxArea(int[] height) {
        int max =0;
        int l=0,r=height.length-1;
        while(l<r){
            int i=0;
            if(height[l]<height[r]){
              i =  height[l]*(r-l);
              l++;
            }else {
                i =  height[r]*(r-l);
                r--;
            }
            max = Math.max(max, i);
        }
        return max;
    }
}