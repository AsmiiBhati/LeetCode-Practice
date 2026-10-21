class Solution {
    public int minOperations(String s) {
        char min = s.charAt(0);
        char max = s.charAt(0);
        boolean sorted = true;

        for(int i = 1;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c < min) min = c;
            if(c > max) max = c;
            if(c < s.charAt(i-1)) sorted = false;
        }

        if(sorted) return 0;
        if(s.length() == 2) return -1;
        if(s.charAt(0) == min || s.charAt(s.length() - 1) == max) return 1;

        for(int i = 1;i<s.length() - 1;i++)
        {
            if(s.charAt(i) == min || s.charAt(i) == max) return 2;
        }
        return 3;
    }
}