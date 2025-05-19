class Solution {
    public int smallestIndex(int[] nums) {
        if(nums.length > 100){
            return -1;
        }
        
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            int x = nums[i];
            if (x<0 || x>1000){
                return -1;
            } 
            while(x>0){
                sum += (x%10);
                x/=10;
            }
            if (x == 0 && i == sum) {
                return i;
        }}
        return -1;
    }
}