class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Arrays.sort(nums);
        int a =0;
        int b=1;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0) {
                arr[a] = nums[i];
                a+=2;
                }
            else{
                arr[b] = nums[i];
                b+=2;
                }
            }
            return arr;
        }
        
    }
