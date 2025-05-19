class Solution {
    public int rev = 0;
    public int reverse(int x) { // 1534236469
        if(x==0){
            return rev;
        }
        if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
             return 0;
        }
        else {
            rev = (rev * 10) + (x % 10);
        }
        return reverse(x/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.reverse(x));
    }
}