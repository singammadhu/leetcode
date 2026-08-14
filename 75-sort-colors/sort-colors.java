class Solution {
    public void sortColors(int[] nums) {
       int n=nums.length;
       int count0 = 0, count1 = 0, count2 = 0;
       // Pass 1: Count occurrences of each number
    for (int num : nums) {
        if (num == 0) count0++;
        else if (num == 1) count1++;
        else if (num == 2) count2++;
    }

    // Pass 2: Overwrite the array in sorted order
    int idx = 0;
    for (int i = 0; i < count0; i++) {
        nums[idx++] = 0;
    }
    for (int i = 0; i < count1; i++) {
        nums[idx++] = 1;
    }
    for (int i = 0; i < count2; i++) {
        nums[idx++] = 2;
    }

    //   int zs=0;
    //   int os=0;
    //   int ts=0;
    //   for(int i=0;i<nums.length;i++){
    //     if(nums[i]==0){
    //         zs++;
    //     }else if(nums[i]==1){
    //         os++;
    //     }else{
    //         ts++;
    //     }
    //   }
    
    //   for(int i=0; i<zs;i++){
    //     nums[i]=0;
    //   }
    //   for(int i=zs; i<os+zs;i++){
    //     nums[i]=1;
    //   }
    //   for(int i=zs+os; i<n;i++){
    //     nums[i]=2;
    //   }
    }
}