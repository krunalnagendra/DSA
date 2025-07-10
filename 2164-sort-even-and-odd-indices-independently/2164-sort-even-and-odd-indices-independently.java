import java.util.*;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // Step 1: Separate elements at even and odd indices
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        // Step 2: Sort even in ascending, odd in descending
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());

        // Step 3: Merge back into original array
        int evenIdx = 0, oddIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(evenIdx++);
            } else {
                nums[i] = odd.get(oddIdx++);
            }
        }

        return nums;
    }
}
