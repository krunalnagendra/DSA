class Solution {
    public double myPow(double x, int n) {
        double pow = 1;
        long N = n;
        if (n < 0) {
            N = -N;
            x = 1 / x;
        }
        while (N > 0) {
            if ((N % 2) == 1) {
                pow *= x;
            }
            x *= x;
            N /= 2;
        }

        return pow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.myPow(x, n));
    }
}