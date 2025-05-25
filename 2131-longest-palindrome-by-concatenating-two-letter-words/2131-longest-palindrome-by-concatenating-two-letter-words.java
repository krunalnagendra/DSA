class Solution {
    public int longestPalindrome(String[] words) {
        int w = 0;
        boolean[] used = new boolean[words.length];
        boolean centerUsed = false;

        for (int i = 0; i < words.length; i++) {
            if (used[i]) continue;

            for (int k = i + 1; k < words.length; k++) {
                if (used[k]) continue;

                String one = words[i];
                String two = words[k];

                if (one.charAt(0) == two.charAt(1) && one.charAt(1) == two.charAt(0)) {
                    w += 4;
                    used[i] = true;
                    used[k] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (!used[i] && words[i].charAt(0) == words[i].charAt(1)) {
                w += 2;
                break;
            }
        }

        return w;
    }
}
