class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;
        int low = 0, high = m, answer = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canMakeZeroArray(nums, queries, m - mid)) {
                answer = mid;
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }

    private boolean canMakeZeroArray(int[] nums, int[][] queries, int usedQueries) {
        int n = nums.length;
        int[] diff = new int[n + 2];
        for (int i = 0; i < usedQueries; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            diff[l] += 1;
            if (r + 1 < n) {
                diff[r + 1] -= 1;
            }
        }
        int[] coverage = new int[n];
        int current = 0;
        for (int i = 0; i < n; i++) {
            current += diff[i];
            coverage[i] = current;
            if (coverage[i] < nums[i]) {
                return false;
            }
        }
        return true;
    }
}
