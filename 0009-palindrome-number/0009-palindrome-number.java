class Solution {
    public boolean isPalindrome(int x) {
        int pal = 0; int i = x;
        while (x > 0) {
            pal = (pal * 10) + (x % 10);
            x = x / 10;
        }

        if (pal == i) {
            return true;
        } else {
            return false;
        }

    }
}