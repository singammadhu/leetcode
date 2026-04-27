class Solution {
        public int countElements(int[] nums) {

          int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;

        // Find min & max
         for (int num : nums) {
          if (num > max) max = num;
          if (num < min) min = num;
         }

         // Edge case
         if (min == max) return 0;

        int minCount = 0, maxCount = 0;

        for (int num : nums) {
          if (num == min) minCount++;
          if (num == max) maxCount++;
        }

         return nums.length - minCount - maxCount;
        }
}      
