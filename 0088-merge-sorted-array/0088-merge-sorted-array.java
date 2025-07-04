class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int [m+n];
        int k=0;
        for(int i=0; i<m; i++){
            merge[k] = nums1[i];
            k++;
        }
        for(int i=0; i<n;i++){
            merge[k] = nums2[i];
            k++;
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = merge[i];
        }
        Arrays.sort(nums1);

    }
}