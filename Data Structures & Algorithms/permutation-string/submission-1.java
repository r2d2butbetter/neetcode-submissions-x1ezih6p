class Solution {
public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1count = new int[26];
        int[] s2count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1count[i] == s2count[i]) {
                matches++;// will be 26 if all chars are same
            }
        }

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {

            if (matches == 26) {
                return true;// matched all chars
            }

            int idx = s2.charAt(r) - 'a';
            s2count[idx]++;// add this char count to freq array

            if (s1count[idx] == s2count[idx]) {
                matches++;
            } else if (s1count[idx] + 1 == s2count[idx]) {
                matches--;// cuz they are not equal after sliding the window
            }

            idx = s2.charAt(l) - 'a';
            s2count[idx]--; // remove this char from freq array

            if (s1count[idx] == s2count[idx]) {
                matches++;
            } else if (s1count[idx] - 1 == s2count[idx]) {
                matches--;// cuz they are not equal after sliding the window
            }
            l++;
        }

        return matches == 26;
    }
}
