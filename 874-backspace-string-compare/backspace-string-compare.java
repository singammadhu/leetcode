class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getActualString(s).equals(getActualString(t));
    }
    String getActualString(String input){
        int backSpace=0;
        StringBuilder actualString=new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)=='#'){
                backSpace++;
                continue;// come with next element
            }
            if(backSpace>0){
              backSpace--;//skip this element
            }else{
                actualString.insert(0,input.charAt(i));//add this to actualString as not backSpace
            }
        }
        return actualString.toString();
    }
}