class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            boolean n=true;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j] && i!=j){
                    n=false;
                    break;
                }
            }
            if (n){
                return nums[i];
            }
        
        }
    return 0;
    }
}