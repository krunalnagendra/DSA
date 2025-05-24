class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        for (int i = 0; i < 31; i++) {
            int a = (int)Math.pow(2,i);;
            if(n>a){
                continue;
            }
            if(n==a){
                return true;
            }
            if(n<a){
                break;
            }
            }
         return false;}
       
    }
