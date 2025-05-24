class Solution {
    public boolean isPowerOfTwo(int n) {
        // Power of two must be a positive number
        if (n <= 0) return false;

        // Use bitwise trick: only one bit should be set
        return (n & (n - 1)) == 0;
    }
}
