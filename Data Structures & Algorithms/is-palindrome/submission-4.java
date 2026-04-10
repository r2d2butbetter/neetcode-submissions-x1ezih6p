class Solution {
    public boolean isPalindrome(String s) {
        
        String str = cleaned(s);
        char[] arr = str.toCharArray();
        int i =0, j=arr.length-1;
        
        while(i<j)
        {
            if(!(arr[i]==arr[j])) return false;

            i++;j--;
        }

        return true;
    }

    public String cleaned(String s)
    {
        StringBuilder str = new StringBuilder();

        for(char c: s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                str.append(c);
            }
        }
        return str.toString().toLowerCase();
    }
}
