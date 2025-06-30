import java.util.*;
class Solution {
    public int findLHS(int[] nums) {
        int n =nums.length;
        int max=0;
        int a;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                if(nums[i] - nums[j] ==1 || nums[j] - nums[i] ==1){
                    if(max < j-i+1) max = j-i+1;
                } 
            }
        }
        return max;
    }
}