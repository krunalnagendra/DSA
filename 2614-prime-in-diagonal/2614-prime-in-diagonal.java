class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {
            int a = nums[i][i];
            if (isPrime(a) && a > maxPrime) maxPrime = a;

            int b = nums[i][n - i - 1];
            if (isPrime(b) && b > maxPrime) maxPrime = b;
        }

        return maxPrime;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
