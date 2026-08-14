class Solution {
    public int removeElement(int[] nums, int val) {

        int w = 0;  // Worker: position where the next valid element goes.
        int r =0;
        // for (int r = 0; r < nums.length; r++) {
        while(r<nums.length){

            // r = Inspector: checks every place one by one.
            if (nums[r] != val) {

                // Not a dustbin → give this element to w.
                nums[w] = nums[r];

                // w placed the valid element, so move to next position.
                w++;
                r++;
            }else{r++;}
              
            // If nums[r] == val:
            // It is a dustbin → don't write anything.
            // w stays here while r moves to find the next valid element.
        }

        // w = number of valid elements placed.
        return w;
    }
}