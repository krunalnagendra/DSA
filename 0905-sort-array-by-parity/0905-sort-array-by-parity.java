class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int a = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0){
                arr[a] = nums[i];
                a++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2!=0){
                arr[a] = nums[i];
                a++;
            }
        }
        return arr;
    }
}