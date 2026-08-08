class Solution {
    public int minimumLength(String s) {
      int n = s.length();
      int l=0;
      int r=n-1;
      while(l<r&& s.charAt(l)==s.charAt(r)){
           char ch = s.charAt(l); 
          // Skip all consecutive ch from the left.
          while (l < r && ch == s.charAt(l)) {
           l++;
           }

           // Skip all consecutive ch from the right.
           while (l <= r && ch == s.charAt(r)) {
            r--;
           }    
      }
      return r-l+1;  
    }
}