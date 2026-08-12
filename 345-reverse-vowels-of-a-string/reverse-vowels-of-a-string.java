class Solution {
    public String reverseVowels(String s) {

        Set<Character> vowels = Set.of(
            'a','e','i','o','u',
            'A','E','I','O','U'
        );

        char[] arr = s.toCharArray();

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            if (vowels.contains(arr[l]) &&
                vowels.contains(arr[r])) {

                // Both are vowels → swap them.
                swap(arr, l, r);

                l++;
                r--;

            } else if (vowels.contains(arr[l])) {

                // Only left is a vowel, right is not.
                // Keep left vowel and move right to find
                // the next vowel to swap with it.
                r--;

            } else {

                // Only right is a vowel, left is not.
                // Keep right vowel and move left to find
                // the next vowel to swap with it.
                l++;
            }
        }

        // Convert char[] back to String.
        return new String(arr);
    }

    void swap(char[] arr, int l, int r) {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}