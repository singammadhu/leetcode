class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n= people.length;
        int l=0;
        int r=n-1;
        int boats=0;
        while(l<=r){
            int sum =people[l]+people[r];
            if(sum>limit){ 
                boats++;
                 r-- ;      
            }else if(sum>limit && l==r){
              boats++;
              r--; 
            }else{
                boats++;
               l++;
               r--;
            }
        }
        
        return boats;
    }
}