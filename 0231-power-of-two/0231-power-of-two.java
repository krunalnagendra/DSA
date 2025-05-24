class Solution {
    public boolean isPowerOfTwo(int n) {

        for (int i = 0; i < 31; i++) {
            int a = (int)Math.pow(2,i);
            n =Math.abs(n);
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
