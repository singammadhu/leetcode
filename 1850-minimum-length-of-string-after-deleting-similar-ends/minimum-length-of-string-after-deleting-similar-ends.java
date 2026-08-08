class Solution {
    public int minimumLength(String s) {

        int l = 0;
        int r = s.length() - 1;

        /*
         * l <= r because:
         *
         * l == r means one character is still remaining.
         * We must allow this case to be processed.
         *
         * l < r  -> at least 2 characters remain
         * l == r -> exactly 1 character remains
         * l > r  -> no characters remain
         */
        while (l < r && s.charAt(l) == s.charAt(r)) {

            char ch = s.charAt(l);

            // Skip all consecutive ch from the left.
            while (l <= r && s.charAt(l) == ch) {
                l++;
            }

            // Skip all consecutive ch from the right.
            while (l <= r && s.charAt(r) == ch) {
                r--;
            }
        }

        /*
         * Distance between positions = r - l
         *
         * Number of elements from l through r = r - l + 1
         *
         * We need the number of remaining characters,
         * so we use r - l + 1.
         */
        return r - l + 1;
    }
}