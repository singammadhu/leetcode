class Solution {
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] sortArrayByParity(int[] nums) {
        int wf=0;
        int n=nums.length;
        int wb=n-1;
        int r=0;
        int[] ans= new int[n];
        while(r<n){
            if(nums[r]%2==0){
              ans[wf]=nums[r];
              wf++;
              r++;
            }else{
                ans[wb]=nums[r];
                wb--;
                r++;
            }
        }
        return ans;
    } 
}
    // int l = 0;
    //     int r = nums.length - 1;

    //     while (l < r) {

    //         if (nums[l] % 2 == 0) {
    //             // Left is already even → correct side.
    //             l++;

    //         } else if (nums[r] % 2 != 0) {
    //             // Right is already odd → correct side.
    //             r--;

    //         } else {
    //             // Left is odd and right is even → swap.
    //             swap(nums, l, r);
    //             l++;
    //             r--;
    //         }
    //     }

    //     return nums;
    // }