class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] sum = new int[k];
        int[][] arr = new int[nums.length][2];
        for(int i=0; i<nums.length; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (x, y) -> Integer.compare(x[0],y[0])); 
        int[] index = new int[k];
        int n = nums.length  -k;
        for(int i=0; i<k; i++){
            index[i]=arr[n][1];
            n++;
        }
        Arrays.sort(index);
        n = nums.length  -k;
        for(int i=0; i<k; i++){
            sum[i]=nums[index[i]];
            n++;
        }
        return sum;
    }
}