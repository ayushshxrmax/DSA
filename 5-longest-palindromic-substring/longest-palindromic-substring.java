class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();

        if (n <= 1) {
            return s;
        }

        int max_len = 1;
        int sp = 0;
        int lp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (solve(s, i, j)) {

                    if (j - i + 1 > max_len) {
                        max_len = j - i + 1;
                        sp = i;
                        lp = j;
                    }
                }
            }
        }

        return s.substring(sp, lp + 1);
    }

    private boolean solve(String s, int i, int j) {

        if (i >= j) {
            return true;
        }

        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }

        return solve(s, i + 1, j - 1);
    }
}
