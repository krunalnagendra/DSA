class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int a = 0;
        int[] next = new int[n];
        for(int i =0; i<n; i++){
            next[i] = -1;
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    a=j;
                    break;
                }
            }
            for(int j = a+1; j<nums2.length; j++ ){
                if(nums1[i]<nums2[j]) next[i] = nums2[j]; break;
            }
        }
        return next;
    }
}