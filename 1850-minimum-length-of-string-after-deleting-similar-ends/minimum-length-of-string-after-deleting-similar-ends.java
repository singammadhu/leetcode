class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;

        while (l < r && s.charAt(l) == s.charAt(r)) {
            char ch = s.charAt(l);

            // skip consecutive ch from the left (original < style)
            while (l < r && ch == s.charAt(l)) {
                l++;
            }

            // skip consecutive ch from the right
            while (l < r && ch == s.charAt(r)) {
                r--;
            }

            // now handle the pure-run leftovers
            if (l == r && s.charAt(l) == ch) {          // odd length left
                return 0;
            }
            if (r == l + 1 && s.charAt(l) == s.charAt(r)) { // even length left
                return 0;
            }
        }
        return r - l + 1;
    }
}