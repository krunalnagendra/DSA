class Solution {
    public int minMaxDifference(int num) {
        int n = 0;
        String str = Integer.toString(num);

        int[] ndigits = new int[str.length()];
        int[] mdigits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ndigits[i] = str.charAt(i) - '0';
            mdigits[i] = str.charAt(i) - '0';
        }

        // Max: replace first non-9 digit in ndigits with 9
        for (int i = 0; i < ndigits.length; i++) {
            if (ndigits[i] != 9) {
                n = ndigits[i];
                break;
            }
        }
        for (int i = 0; i < ndigits.length; i++) {
            if (ndigits[i] == n) {
                ndigits[i] = 9;
            }
        }

        // Convert to max number
        int max = 0;
        for (int digit : ndigits) {
            max = max * 10 + digit;
        }

        // Min: replace first non-0 digit in mdigits with 0
        int m = -1;
        for (int i = 0; i < mdigits.length; i++) {
            if (mdigits[i] != 0) {
                m = mdigits[i];
                break;
            }
        }
        for (int i = 0; i < mdigits.length; i++) {
            if (mdigits[i] == m) {
                mdigits[i] = 0;
            }
        }

        // Convert to min number
        int min = 0;
        for (int digit : mdigits) {
            min = min * 10 + digit;
        }

        return max - min;
    }
}
