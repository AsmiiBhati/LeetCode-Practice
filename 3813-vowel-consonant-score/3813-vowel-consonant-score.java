class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;
        for(char ch : s.toCharArray())
        {
            if(isVowel(ch))
            {
                v++;
            }
            else if(Character.isLetter(ch) && !isVowel(ch))
            {
                c++;
            }
        }
        return c == 0 ? 0 : (int) Math.floor(v/c);
    }
    boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}