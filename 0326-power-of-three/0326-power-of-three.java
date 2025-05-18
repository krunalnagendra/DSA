class Solution {
    public boolean isPowerOfThree(int n) {
        if (n==0){
        return false;}
        if (n==1){
        return true;}
        if (n%3 == 0){
            if(n==3){
                return true;
            }
        }
        else{
            return false;
        }
        return isPowerOfThree(n/3);
    }}
