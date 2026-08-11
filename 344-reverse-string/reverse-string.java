class Solution {
    void swap(char[] s, int i, int j){
         char temp = s[i];
         s[i]=s[j];
         s[j]=temp;
        }
    public void reverseString(char[] s) {
        
        int l=0, r=s.length-1;
        while(l<r){
            swap(s,l,r);
            l++;
            r--;
        }
    }
}