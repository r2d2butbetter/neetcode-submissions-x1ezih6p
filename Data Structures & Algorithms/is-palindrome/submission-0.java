class Solution {
    public static String removeExtraChars(String s) {
        // return s.replaceAll("\\s", "");

        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                str.append(c);
            }
        }

        return str.toString().toLowerCase();
    }

    public boolean isPalindrome(String s) {

        String str = removeExtraChars(s);

        char[] arr = str.toCharArray();
        int front = 0;
        int back = arr.length - 1;

        while (front <= back) {
            if (arr[front] != arr[back]) {
                return false;
            }

            front++;
            back--;
        }

        return true;
    }
}