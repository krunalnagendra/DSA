class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Otherwise, set current digit to 0 and continue the loop
            digits[i] = 0;
        }

        // If all digits were 9, we get here. Need a new array with an extra digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // e.g. [9,9,9] → [1,0,0,0]
        return newNumber;
    }
}
