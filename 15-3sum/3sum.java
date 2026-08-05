class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        List< List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<n-2;i++){
             

           if (i > 0 && nums[i] == nums[i - 1]) {
               continue; // why not i++
              }


           int l=i+1,r=n-1;

          
           while(l<r){
            int sum =nums[l]+nums[r]+nums[i];
                if(sum==0){
                    List<Integer> triplet = new ArrayList<>();
                     triplet.add(nums[i]);
                     triplet.add(nums[l]);
                     triplet.add(nums[r]);
                     ans.add(triplet);

                     l++;
                     r--;


                 while (l<r&&nums[l]==nums[l-1]){
                  l++;
                  }
                while(l<r&&nums[r]==nums[r+1]){
                 r--;
                 }
                }
                else if (sum < 0) {
                    l++;
                }

                 else {
                    r--;
                }

               
           }
           
        }
      return ans;   
}
}


// ✅ Brute Force (O(n³)) — Three loops + HashSet
//  public List<List<Integer>> threeSum(int[] nums) {
//         int n= nums.length;
//         List< List<Integer>> ans = new ArrayList<>();
//         Set< List<Integer>> set = new HashSet<>();

//         for(int i=0;i<n;i++){
//           for(int j =i+1;j<n;j++){
//             for(int k=j+1; k<n; k++){
//                 if(nums[i]+nums[j]+nums[k]==0){
//                     List<Integer> triplet = new ArrayList<>();
//                     triplet.add(nums[i]);
//                     triplet.add(nums[j]);
//                     triplet.add(nums[k]);
//                     //List<Integer> triplet =  new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
//                     //List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
//                     //List<Integer> triplet =List.of(nums[i],nums[j],nums[k]);

//                     Collections.sort(triplet);
//                     if(!set.contains(triplet)){
//                         set.add(triplet);
//                         ans.add(triplet);
//                     }
//                 }
                
//             }
//           } 
//         }
//         return ans;
//     }


//✅ Better (O(n²)) — HashSet + Two Sum idea