class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int arr[] = new int [nums.length];
        Arrays.sort(nums);
        int a=0;
        int b=1;
        for(int i=0; i<nums.length; i++){
            int rev = nums.length - i -1;
            if(nums[i]%2 ==0){
                arr[a]=nums[i];
                a+=2;
            }
            if(nums[rev]%2!=0){
                arr[b] = nums[rev];
                b+=2;
            }
        }
        return arr;
    }
}