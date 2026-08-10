class Solution {
    public String reverseVowels(String s) {
        Set<Character>  vowels = Set.of('a','e','i','o','u',
                               'A','E','I','O','U');
       char[] arr = s.toCharArray();
       int l=0;
       int r=s.length()-1;
       //int r = arr.length - 1;
       while(l<r){
        if(vowels.contains(arr[l])&&vowels.contains(arr[r])){
          swap(arr,l,r);
          l++;
          r--;
        }else if(vowels.contains(arr[l])){
          r--;
        }else{
            l++;
        }
       }
       return new String(arr);
    }
    void swap(char[] arr,int l,int r){
        char temp =arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}